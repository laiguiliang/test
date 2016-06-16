package org.seckill.dao.cache;

import org.seckill.entity.Seckill;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

import com.dyuproject.protostuff.LinkedBuffer;
import com.dyuproject.protostuff.ProtostuffIOUtil;
import com.dyuproject.protostuff.runtime.RuntimeSchema;

public class RedisDao {

	private final Logger logger = LoggerFactory.getLogger(this.getClass());

	private final JedisPool jedisPool;
	
	public RedisDao(String ip, int port) {
		jedisPool = new JedisPool(ip, port);
	}

	private RuntimeSchema<Seckill> schema = RuntimeSchema.createFrom(Seckill.class);

	public Seckill getSeckill(long seckillId) {
		// redis操作逻辑
		try {
			Jedis jedis = jedisPool.getResource();
			try {
				String key = "seckill:" + seckillId;
				/*
				 * 并没有实现内部序列化操作
				 * get->byte[] -> 反序列华 ->Object(Seckill)
				 * 采用自定义序列化
				 * protostuff : pojo
				 */
				byte[] bytes = jedis.get(key.getBytes());
				//缓存重获取到
				if(bytes != null){
					//空对象
					Seckill seckill = schema.newMessage();
					ProtostuffIOUtil.mergeFrom(bytes, seckill, schema);
					//seckill 被反序列化
					return seckill;
				}
			} finally {
				jedis.close();
			}
		} catch (Exception e) {
			logger.error(e.getMessage(), e);
		}

		return null;
	}

	public String putSeckill(Seckill seckill) {
		// set Object(Seckill) -> 序列化  -> byte[]
		try {
			Jedis jedis = jedisPool.getResource();
			try {
				String key = "seckill:" + seckill.getSeckillId();
				byte[] bytes = ProtostuffIOUtil.toByteArray(seckill, schema, 
						LinkedBuffer.allocate(LinkedBuffer.DEFAULT_BUFFER_SIZE));
				//超时缓存
				int timeout = 60 * 60;//单位是 秒   这里表示1小时
				String result = jedis.setex(key.getBytes(), timeout, bytes);
				
				//save方法，真正将数据写到redis缓存中，即使重启服务(在执行删除时，不调用save方法的前提下)，缓存数据也不会丢失
				String saveStr = jedis.save();//add data to disk
				//System.err.println("saveStr::::="+saveStr);
				return result;
			} finally {
				jedis.close();
			}
		} catch (Exception e) {
			logger.error(e.getMessage(), e);
		}
		return null;
	}
	
	public long delSeckill(long seckillId){
		Seckill seckill = this.getSeckill(seckillId);
		long result = 0l;
		if(seckill != null){
			Jedis jedis = jedisPool.getResource();
			String key = "seckill:" + seckillId;
			result = jedis.del(key.getBytes());
			//对于调用save方法保存的缓存数据，如果删除时，不调用save方法，重启服务后，该缓存数据还在~但在重启服务之前，该数据不存在
//			jedis.save();// delete data from disk
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		
	}
}

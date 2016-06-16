package org.seckill.service.impl;

import java.util.List;

import org.seckill.dao.SeckillDao;
import org.seckill.dao.SuccessKilledDao;
import org.seckill.dto.Exposer;
import org.seckill.entity.Seckill;
import org.seckill.exception.SeckillExecution;
import org.seckill.service.SeckillService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * 
 * @author laigl 2016年6月12日
 *
 */
@Service
public class SeckillServiceImpl implements SeckillService {

	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private SeckillDao seckillDao;
	@Autowired
	private SuccessKilledDao successKilledDao;
	
	public List<Seckill> getSeckillList() {
		return null;
	}

	public Seckill getById(long seckillId) {
		return null;
	}

	public Exposer exportSeckillUrl(long seckillId) {
		return null;
	}

	/**
	 * 使用注解控制事务方法的优点：
	 * 1：开发 团队达成一致约定，明确标注事务方法 的编程风格
	 * 2：保证事务方法的执行时间尽可能短，不要穿插其他网络操作，RPC/HTTP请求或者剥离到事务方法外部
	 * 3：不是所有的方法都需要事务，如只有一条修改操作，只读操作不需要事务控制
	 */
	@Transactional
	public SeckillExecution executeSeckill(long seckillId, long userPhone,
			String md5) {
		// TODO Auto-generated method stub
		return null;
	}


}

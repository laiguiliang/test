package org.seckill.service;

import java.util.List;

import org.seckill.dto.Exposer;
import org.seckill.entity.Seckill;
import org.seckill.exception.SeckillExecution;

/**
 * 业务接口：站在使用者的角度设计接口 
 * 三个方面：方法定义力度,参数，返回类型（return 类型(要友好)/异常）
 * @author laigl 2016年6月12日
 *
 */
public interface SeckillService {

	/**
	 * 查询所有的秒杀记录
	 * @return
	 */
	List<Seckill> getSeckillList();
	
	/**
	 * 查询单个的秒杀记录
	 * @param seckillId
	 * @return
	 */
	Seckill getById(long seckillId);
	
	/**
	 * 暴露秒杀地址
	 * @param seckillId
	 * @return
	 */
	Exposer exportSeckillUrl(long seckillId);
	
	/**
	 * 执行秒杀
	 * @param seckillId
	 * @param userPhone
	 * @param md5
	 * @return
	 */
	SeckillExecution executeSeckill(long seckillId,long userPhone,String md5);
}

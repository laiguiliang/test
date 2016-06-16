package org.seckill.service;

import java.util.List;

import org.seckill.dto.Exposer;
import org.seckill.entity.Seckill;
import org.seckill.exception.SeckillExecution;

/**
 * ҵ��ӿڣ�վ��ʹ���ߵĽǶ���ƽӿ� 
 * �������棺������������,�������������ͣ�return ����(Ҫ�Ѻ�)/�쳣��
 * @author laigl 2016��6��12��
 *
 */
public interface SeckillService {

	/**
	 * ��ѯ���е���ɱ��¼
	 * @return
	 */
	List<Seckill> getSeckillList();
	
	/**
	 * ��ѯ��������ɱ��¼
	 * @param seckillId
	 * @return
	 */
	Seckill getById(long seckillId);
	
	/**
	 * ��¶��ɱ��ַ
	 * @param seckillId
	 * @return
	 */
	Exposer exportSeckillUrl(long seckillId);
	
	/**
	 * ִ����ɱ
	 * @param seckillId
	 * @param userPhone
	 * @param md5
	 * @return
	 */
	SeckillExecution executeSeckill(long seckillId,long userPhone,String md5);
}

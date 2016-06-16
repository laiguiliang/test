package org.seckill.dao;

import org.seckill.entity.SuccessKilled;
import org.seckill.mapper.MyBatisMapper;

@MyBatisMapper
public interface SuccessKilledDao {

	/**
	 * ���빺����ϸ���ɹ����ظ�
	 * @param seckillId
	 * @param userPhone
	 * @return ���������
	 */
	int insertSuccessKilled(long seckillId,long userPhone);
	
	/**
	 * ����id��ѯSuccessKilled��Я����ɱ��Ʒ����ʵ��
	 * @param seckillId
	 * @return
	 */
	SuccessKilled queryByIdWithSeckill(long seckillId);
	
}

package org.seckill.dao;

import java.util.Date;
import java.util.List;

import org.seckill.entity.Seckill;
import org.seckill.mapper.MyBatisMapper;

@MyBatisMapper
public interface SeckillDao {

	/**
	 * �����
	 * @param seckillId
	 * @param killTime
	 * @return ���Ӱ������ ��1����ʾ���µļ�¼����
	 */
	int reduceNumber(long seckillId,Date killTime);
	
	/**
	 * ����id��ѯ��ɱ����
	 * @param seckillId
	 * @return
	 */
	Seckill queryById(long seckillId);
	
	/**
	 * ����ƫ������ѯ��ɱ��Ʒ�б�
	 * @param offet
	 * @param limit
	 * @return
	 */
	List<Seckill> queryAll(int offet,int limit);
	
}

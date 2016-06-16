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
 * @author laigl 2016��6��12��
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
	 * ʹ��ע��������񷽷����ŵ㣺
	 * 1������ �ŶӴ��һ��Լ������ȷ��ע���񷽷� �ı�̷��
	 * 2����֤���񷽷���ִ��ʱ�価���̣ܶ���Ҫ�����������������RPC/HTTP������߰��뵽���񷽷��ⲿ
	 * 3���������еķ�������Ҫ������ֻ��һ���޸Ĳ�����ֻ����������Ҫ�������
	 */
	@Transactional
	public SeckillExecution executeSeckill(long seckillId, long userPhone,
			String md5) {
		// TODO Auto-generated method stub
		return null;
	}


}

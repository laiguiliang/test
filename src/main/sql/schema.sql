--���ݿ��ʼ���ű�

-- �������ݿ�
CREATE DATABASE seckill;
-- ʹ�����ݿ�
use seckill;
-- ������ɱ���ݿ�
CREATE TABLE seckill(
	'seckill_id' bigint NOT NULL AUTO_INCREMENT COMMENT '��Ʒ���id',
	'name' varchar(120) NOT NULL COMMENT '��Ʒ����',
	'number' int NOT NULL COMMENT '�������',
	'start_time' timestamp NOT NULL COMMENT '��ɱ����ʱ��',
	'end_time' timestamp NOT NULL COMMENT '��ɱ����ʱ��',
	'create_time' timestamp NOT NULL COMMENT '����ʱ��',
	PRIMARY KEY (seckill_id),
	key idx_start_time(start_time),
	key idx_end_time(end_time),
	key idx_create_time(create_time)
)ENGINE=InnoDB AUTO_INCREMENT=1000 DEFAULT CHARSET=utf-8 COMMENT='��ɱ����';



CREATE TABLE seckill(
	seckill_id bigint NOT NULL AUTO_INCREMENT COMMENT '��Ʒ���id',
	name varchar(120) NOT NULL COMMENT '��Ʒ����',
	number int NOT NULL COMMENT '�������',
	start_time timestamp NOT NULL COMMENT '��ɱ����ʱ��',
	end_time timestamp NOT NULL COMMENT '��ɱ����ʱ��',
	create_time timestamp NOT NULL COMMENT '����ʱ��',
	PRIMARY KEY (seckill_id),
	key idx_start_time(start_time),
	key idx_end_time(end_time),
	key idx_create_time(create_time)
)ENGINE=InnoDB AUTO_INCREMENT=1000 DEFAULT CHARSET=utf8 COMMENT='��ɱ����';

--��ʼ������
insert into 
	seckill(name,number,start_time,end_time)
values
	('1000Ԫ��ɱiphone6',100,'2016-05-12 00:00:00','2016-05-14 00:00:00'),
	('400Ԫ��ɱipad2',200,'2016-05-12 00:00:00','2016-05-14 00:00:00'),
	('300Ԫ��ɱС��',300,'2016-05-12 00:00:00','2016-05-14 00:00:00'),
	('200Ԫ��ɱ����',400,'2016-05-12 00:00:00','2016-05-14 00:00:00');
	
--��ɱ�ɹ���ϸ��
--�û� ��¼��֤��ص���Ϣ
CREATE TABLE success_killed(
	'seckill_id' bigint NOT NULL COMMENT '��ɱ��Ʒid',
	'user_phone' bigint NOT NULL COMMENT '�û��ֻ���',
	'state' tinyint NOT NULL DEFAULT -1 COMMENT '״̬��ʾ��-1����Ч   0���ɹ� 1���Ѹ��� 2���ѷ���',
	'create_time' timestamp NOT NULL COMMENT '����ʱ��',
	PRIMARY KEY (seckill_id,user_phone),/*��������*/
	key idx_create_time(create_time)
)ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='��ɱ�ɹ���ϸ��';


CREATE TABLE success_killed(
	seckill_id bigint NOT NULL COMMENT '��ɱ��Ʒid',
	user_phone bigint NOT NULL COMMENT '�û��ֻ���',
	state tinyint NOT NULL DEFAULT -1 COMMENT '״̬��ʾ��-1����Ч   0���ɹ� 1���Ѹ��� 2���ѷ���',
	create_time timestamp NOT NULL COMMENT '����ʱ��',
	PRIMARY KEY (seckill_id,user_phone),/*��������*/
	key idx_create_time(create_time)
)ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='��ɱ�ɹ���ϸ��';

--�������ݿ����̨
mysql -uroot -p

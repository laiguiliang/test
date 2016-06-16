package org.seckill.util.task;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;


@Service
public class TaskService {
    private Logger logger = LoggerFactory.getLogger(getClass());
    
    private SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");


    private int timeNum = 1;
    
//    @Scheduled(cron = "0 * 17 * * ?")
    @Scheduled(cron="0/5 * *  * * ? ")   //每5秒执行一次 
    // 每天凌晨1点执行
    public void doTask() {
        synchronized (this) {
        	logger.info("-------执行定时服务------"+timeNum+"-------次--------");
        	logger.info("-------现在时间是：＝" + sdf.format(new Date()));
            timeNum++;
        }
    }
    
    
    public static void main(String[] args) {
    	  SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd 24HH:mm:ss");
    	 System.err.println("现在时间是：＝" + sdf2.format(new Date()));
	}
}

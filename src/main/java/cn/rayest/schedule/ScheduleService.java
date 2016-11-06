package cn.rayest.schedule;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Rayest on 2016/11/6 0006.
 */
@Service
public class ScheduleService {
    private static final SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("HH:mm:ss");

    @Scheduled(fixedRate = 5000) // 注解该方法为计划任务，fixedRate 属性每隔固定时间执行
    public void reportCurrentTime(){
        System.out.println("每隔五秒钟执行一次：" + DATE_FORMAT.format(new Date()));
    }

   @Scheduled(cron = "0 28 11 ? * *") // cron 属性可以按照指定时间执行，本例是指每天时间 11 点 28 分执行
    public void fixTimeExecution(){
       System.out.println("在指定时间：" + DATE_FORMAT.format(new Date()) + " 执行");
   }
}

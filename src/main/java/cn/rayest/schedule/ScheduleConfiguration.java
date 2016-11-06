package cn.rayest.schedule;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * Created by Rayest on 2016/11/6 0006.
 */
@Configuration
@ComponentScan("cn.rayest.schedule")
@EnableScheduling // 开启对计划任务的支持
public class ScheduleConfiguration {
}

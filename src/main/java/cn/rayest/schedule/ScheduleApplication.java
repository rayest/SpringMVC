package cn.rayest.schedule;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by Rayest on 2016/11/6 0006.
 */
public class ScheduleApplication {
    public static void main(String[] args) {
        new AnnotationConfigApplicationContext(ScheduleConfiguration.class);
    }
}

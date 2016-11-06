package cn.rayest.schedule;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by Rayest on 2016/11/6 0006.
 */
public class ScheduleTest {
    private AnnotationConfigApplicationContext context;

    @Before
    public void setUp() throws Exception {
        context = new AnnotationConfigApplicationContext(ScheduleConfiguration.class);
    }

    @Test
    public void testSchedule() throws Exception {
        ScheduleService scheduleService = context.getBean(ScheduleService.class);
        scheduleService.fixTimeExecution();
        scheduleService.reportCurrentTime();
    }

    @After
    public void tearDown() throws Exception {
        context.close();

    }
}

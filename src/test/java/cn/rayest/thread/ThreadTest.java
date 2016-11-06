package cn.rayest.thread;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by Rayest on 2016/11/6 0006.
 */
public class ThreadTest {
    private AnnotationConfigApplicationContext context;

    @Before
    public void setUp() throws Exception {
        context = new AnnotationConfigApplicationContext(ThreadConfiguration.class);
    }

    @Test
    public void testThread() throws Exception {
        ThreadService threadService = context.getBean(ThreadService.class);
        for (int i = 0; i < 10; i++) {
            threadService.executeAsyncTask(i);
            threadService.executeAsyncTaskPlus(i);
        }
    }

    @After
    public void tearDown() throws Exception {
        context.close();
    }
}

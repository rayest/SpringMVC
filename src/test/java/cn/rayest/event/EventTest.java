package cn.rayest.event;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by Rayest on 2016/11/6 0006.
 */
public class EventTest {
    private AnnotationConfigApplicationContext context;

    @Before
    public void setUp() throws Exception {
         context = new AnnotationConfigApplicationContext(EventConfiguration.class);
    }

    @Test
    public void testEvent() throws Exception {
        EventPublisher eventPublisher = context.getBean(EventPublisher.class);
        eventPublisher.publish("撒扬娜拉");
    }

    @After
    public void tearDown() throws Exception {
        context.close();

    }
}

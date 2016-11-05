package cn.rayest.lifeCycle;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by Rayest on 2016/11/6 0006.
 */
public class serviceTest {
    private AnnotationConfigApplicationContext context;

    @Before
    public void setUp() throws Exception {
        context = new AnnotationConfigApplicationContext(LifeCycleConfiguration.class);
    }

    @Test
    public void testService() throws Exception {
        context.getBean(BeanService.class);
        context.getBean(JSR250Service.class);
    }

    @After
    public void tearDown() throws Exception {
        context.close();
    }
}

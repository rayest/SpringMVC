package cn.rayest.aware;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by Rayest on 2016/11/6 0006.
 */
public class AwareTest {
    private AnnotationConfigApplicationContext context;

    @Before
    public void setUp() throws Exception {
        context = new AnnotationConfigApplicationContext(AwareConfiguration.class);
    }

    @Test
    public void testAware() throws Exception {
        AwareService awareService = context.getBean(AwareService.class);
        awareService.outputResult();
    }

    @After
    public void tearDown() throws Exception {
        context.register();
    }
}

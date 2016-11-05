package cn.rayest.el;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by Rayest on 2016/11/5 0005.
 */
public class ELTest {
    private AnnotationConfigApplicationContext context;

    @Before
    public void setUp() throws Exception {
        context = new AnnotationConfigApplicationContext(ELConfiguration.class);
    }

    @Test
    public void testEL() throws Exception {
        ELService elService = context.getBean(ELService.class);
        elService.outputResource();
    }

    @After
    public void tearDown() throws Exception {
        context.close();
    }
}

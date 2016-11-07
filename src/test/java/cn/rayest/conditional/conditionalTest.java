package cn.rayest.conditional;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.Assert.assertEquals;

/**
 * Created by Rayest on 2016/11/7 0007.
 */
public class conditionalTest {
    private AnnotationConfigApplicationContext context;

    @Before
    public void setUp() throws Exception {
        context = new AnnotationConfigApplicationContext(ConditionConfiguration.class);
    }

    @Test
    public void testConditional() throws Exception {
        ListService listService = context.getBean(ListService.class);
        assertEquals("Windows 10", context.getEnvironment().getProperty("os.name"));
        assertEquals("dir", listService.showListCmd());
    }

    @After
    public void tearDown() throws Exception {
        context.close();
    }
}

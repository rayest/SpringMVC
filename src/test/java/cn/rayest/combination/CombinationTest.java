package cn.rayest.combination;

import cn.rayest.annotation.combination.LeeConfiguration;
import cn.rayest.annotation.combination.RayestService;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.Assert.assertEquals;

/**
 * Created by Rayest on 2016/11/7 0007.
 */
public class CombinationTest {
    private AnnotationConfigApplicationContext context;

    @Before
    public void setUp() throws Exception {
        context = new AnnotationConfigApplicationContext(LeeConfiguration.class);
    }

    @Test
    public void testConditional() throws Exception {
        RayestService rayestService = context.getBean(RayestService.class);
        assertEquals("从自定义的组合注接中获得的 bean", rayestService.output());
    }

    @After
    public void tearDown() throws Exception {
        context.close();
    }
}

package cn.rayest.scope;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

/**
 * Created by Rayest on 2016/11/5 0005.
 */
public class ScopeServiceTest {
    private AnnotationConfigApplicationContext context;

    @Before
    public void setUp() throws Exception {
        context = new AnnotationConfigApplicationContext(ScopeConfig.class);
    }

    @Test
    public void testSingletonService() throws Exception {
        SingletonService singleton1 = context.getBean(SingletonService.class);
        SingletonService singleton2 = context.getBean(SingletonService.class);
        assertEquals(singleton1, singleton2);
    }

    @Test
    public void testPrototypeService() throws Exception {
        PrototypeService prototype1 = context.getBean(PrototypeService.class);
        PrototypeService prototype2 = context.getBean(PrototypeService.class);
        assertNotEquals(prototype1, prototype2);
    }
}

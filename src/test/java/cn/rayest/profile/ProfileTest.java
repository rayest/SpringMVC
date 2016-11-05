package cn.rayest.profile;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.Assert.assertEquals;

/**
 * Created by Rayest on 2016/11/6 0006.
 */
public class ProfileTest {
    private AnnotationConfigApplicationContext context;

    @Before
    public void setUp() throws Exception {
        context = new AnnotationConfigApplicationContext();
    }

    @Test
    public void testProfile() throws Exception {
        context.getEnvironment().setActiveProfiles("production"); // 先将活动的 profile 设置为 production
        context.register(ProfileConfiguration.class); // 再注册配置类
        context.refresh(); // 刷新容器
        ProfileBean ProfileBean = context.getBean(ProfileBean.class);
        assertEquals("from production profile", ProfileBean.getContent());
    }

    @After
    public void tearDown() throws Exception {
        context.close();
    }
}

package cn.rayest.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertEquals;

/**
 * Created by Rayest on 2016/11/6 0006.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {TestConfiguration.class})
@ActiveProfiles("prod")
public class TestTest {
    @Autowired
    private TestEntity testEntity;

    @Test
    public void prodBeanShouldInject() {
        String actual = testEntity.getContent();
        String expected = "from production profile";
        assertEquals(expected, actual);
    }
}

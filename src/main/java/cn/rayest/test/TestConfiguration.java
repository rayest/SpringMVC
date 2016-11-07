package cn.rayest.test;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * Created by Rayest on 2016/11/7 0007.
 */
@Configuration
public class TestConfiguration {
    @Bean
    @Profile("dev")
    public TestEntity devTestBean() {
        return new TestEntity("from development profile");
    }

    @Bean
    @Profile("prod")
    public TestEntity prodTestBean() {
        return new TestEntity("from production profile");
    }
}

package cn.rayest.profile;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * Created by Rayest on 2016/11/6 0006.
 */
@Configuration
public class ProfileConfiguration {
    @Bean
    @Profile("development") // Profile 为 development 时实例化 developProfileBean
    public ProfileBean developProfileBean(){
        return new ProfileBean("from development profile");
    }

    @Bean
    @Profile("production")  // Profile 为 production 时实例化 produceProfileBean
    public ProfileBean produceProfileBean(){
        return new ProfileBean("from production profile");
    }

}

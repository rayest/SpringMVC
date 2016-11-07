package cn.rayest.conditional;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Rayest on 2016/11/7 0007.
 */
@Configuration
public class ConditionConfiguration {
    @Bean
    @Conditional(WindowsCondition.class) // 通过该注解，符合 Windows 条件则实例化 WindowsListService
    public ListService getWindowsListService() {
        return new WindowsListService();
    }

    @Bean
    @Conditional(LinuxCondition.class) // 通过该注解，符合 Windows 条件则实例化 WindowsListService
    public ListService getLinuxListService() {
        return new WindowsListService();
    }
}

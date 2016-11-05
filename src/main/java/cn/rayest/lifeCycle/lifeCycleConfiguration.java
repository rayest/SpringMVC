package cn.rayest.lifeCycle;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Rayest on 2016/11/5 0005.
 */
@Configuration
@ComponentScan("cn.rayest.lifeCycle")
public class LifeCycleConfiguration {
    @Bean(initMethod = "init", destroyMethod = "destroy") // 两个属性值分别对应 BeanService 类中的初始化和销毁方法
    public BeanService beanService() {
        return new BeanService();
    }

    @Bean
    public JSR250Service jsr250Service(){
        return new JSR250Service();
    }
}

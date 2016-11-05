package cn.rayest.aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * Created by Rayest on 2016/8/26 0026.
 */
@Configuration
@ComponentScan("cn.rayest.aop")
@EnableAspectJAutoProxy
public class AopConfig {
}

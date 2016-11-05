package cn.rayest.aspect;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * Created by Rayest on 2016/8/26 0026.
 */
@Configuration
@ComponentScan("cn.rayest.aspect")
@EnableAspectJAutoProxy // 该注解开启 spring 对 AspectJ 的代理的支持
public class AspectConfig {
}

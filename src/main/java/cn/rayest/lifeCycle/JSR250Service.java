package cn.rayest.lifeCycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * Created by Rayest on 2016/11/5 0005.
 */
// 没有 @Service 注解，因为该类是以 @Bean 的方式被注入到配置文件的
public class JSR250Service {
    @PostConstruct // 在构造函数执行完后执行
    public void init() {
        System.out.println("jsr250-init-method");
    }

    public JSR250Service() {
        super();
        System.out.println("初始化构造函数-JSR250Service");
    }

    @PreDestroy // 在 Bean 销毁之前执行
    public void destroy() {
        System.out.println("jsr250-destroy-method");
    }

}

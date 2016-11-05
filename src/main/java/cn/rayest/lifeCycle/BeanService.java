package cn.rayest.lifeCycle;

/**
 * Created by Rayest on 2016/11/5 0005.
 * @Bean 形式的 Bean
 */
// 没有 @Service 注解，因为该类是以 @Bean 的方式被注入到配置文件的
public class BeanService {
    public void init(){
        System.out.println("@Bean-init-method");
    }

    public BeanService(){
        super();
        System.out.println("初始化构造函数-BeanService");
    }

    public void destroy(){
        System.out.println("@Bean-destroy-method");
    }
}

package cn.rayest.aspect;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by Rayest on 2016/8/26 0026.
 */
public class AspectApplication {
    public static void main(String[] args) {
        // 获取注解配置的上下文
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AspectConfiguration.class);
        // 通过 AspectConfig 配置获取 spring 管理的 bean (这里只有 @service 注解的类)
        AspectAnnotationService aspectAnnotationService = context.getBean(AspectAnnotationService.class);
        AspectMethodService aspectMethodService = context.getBean(AspectMethodService.class);
        // 执行 log 切面的方法
        aspectAnnotationService.add();
        aspectMethodService.add();
        // 关闭上下文
        context.close();
    }
}

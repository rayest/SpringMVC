package cn.candy.annotation.annotationAll;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by Rayest on 2016/8/26 0026.
 */
public class Application {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfiguration.class);
        UseFunctionService userFunctionService = context.getBean(UseFunctionService.class);
        System.out.println(userFunctionService.sayHello("Candy"));
    }
}

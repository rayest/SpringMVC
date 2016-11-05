package cn.rayest.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;
import java.lang.reflect.Method;

/**
 * Created by Rayest on 2016/8/26 0026.
 * 切面类
 */
@Aspect // 声明切面
@Component // 该注解使得该切面成为 spring 容器管理的一个 bean
public class LogAspect {

    @Pointcut("@annotation(cn.rayest.aspect.Action)") // 该注解声明切点
    public void annotationPointCut() {
    }

    @After("annotationPointCut()") // 声明一个建言， 并使用 @PointCut 定义的切面
    public void after(JoinPoint joinPoint) {
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        Method method = signature.getMethod();
        Action action = method.getAnnotation(Action.class);
        System.out.println("注解式拦截 " + action.name()); // 通过反射获得注解上的属性，然后做记录相关的操作
    }

    @Before(value = "execution(* cn.rayest.aspect.AspectMethodService.*(..))") // 声明一个建言，此建言直接使用拦截规则作为参数
    public void before(JoinPoint joinPoint) {
        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        Method method = methodSignature.getMethod();
        System.out.println("方法规则式拦截 " + method.getName());
    }
}

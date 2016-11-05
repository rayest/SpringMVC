package cn.rayest.aop;

import org.springframework.stereotype.Service;

/**
 * Created by Rayest on 2016/8/26 0026.
 */
@Service
public class AnnotationService {
    @Action(name="注解式拦截的 add 操作")
    public void add(){}
}

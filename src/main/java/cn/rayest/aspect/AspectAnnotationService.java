package cn.rayest.aspect;

import org.springframework.stereotype.Service;

/**
 * Created by Rayest on 2016/8/26 0026.
 **/
@Service
public class AspectAnnotationService {
    @Action(name="注解式拦截的 add() 方法")
    public void add(){}
}

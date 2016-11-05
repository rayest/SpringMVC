package cn.rayest.aspect;

import java.lang.annotation.*;

/**
 * Created by Rayest on 2016/8/26 0026.
 */

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Action {
    String name();
}

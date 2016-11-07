package cn.rayest.annotation.combination;

import org.springframework.stereotype.Service;

/**
 * Created by Rayest on 2016/11/7 0007.
 */
@Service
public class RayestService {
    public String output(){
        return "从自定义的组合注解中获得的 bean";
    }
}

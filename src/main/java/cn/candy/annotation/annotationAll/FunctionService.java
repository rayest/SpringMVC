package cn.candy.annotation.annotationAll;

import org.springframework.stereotype.Service;

/**
 * Created by Rayest on 2016/8/26 0026.
 */
@Service
public class FunctionService {
    public String sayHello(String word){
        return "Hello " + word + " !";
    }
}

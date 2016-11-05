package cn.rayest.annotation.annotationBean;

/**
 * Created by Rayest on 2016/8/26 0026.
 */
public class UseFunctionService {
    FunctionService functionService;

    public void setFunctionService(FunctionService functionService) {
        this.functionService = functionService;
    }

    public String sayHello(String word){
        return functionService.sayHello(word);
    }
}

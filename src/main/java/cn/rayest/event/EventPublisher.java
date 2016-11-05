package cn.rayest.event;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

/**
 * Created by Rayest on 2016/11/6 0006.
 */
@Component
public class EventPublisher {
    @Autowired
    private ApplicationContext applicationContext; // 注入 ApplicationContext 用来发布事件

    public void publish(String message){
        applicationContext.publishEvent(new Event(this, message)); // 调用 publishEvent 方法发布
    }
}

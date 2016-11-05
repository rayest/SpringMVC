package cn.rayest.event;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * Created by Rayest on 2016/11/6 0006.
 * 事件监听器
 * 实现 ApplicationListener 接口，并指定监听的事件类型
 * 使用 onApplicationEvent 方法进行消息接受处理
 */
@Component
public class EventListener implements ApplicationListener<Event>{

    @Override
    public void onApplicationEvent(Event event) {
        String message = event.getMessage();
        System.out.println("EventListener 接收到了 EventPublisher 发布的消息：" + message);
    }
}

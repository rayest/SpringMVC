package cn.rayest.thread;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 * Created by Rayest on 2016/11/6 0006.
 */
@Service
public class ThreadService {

    @Async // 注解该方法为异步方法
    public void executeAsyncTask(Integer i) {
        System.out.println("执行异步任务：" + i);
    }

    @Async
    public void executeAsyncTaskPlus(Integer i){
        System.out.println("执行异步任务 +1: " + i);
    }
}

package cn.rayest.integration;

import org.springframework.stereotype.Service;

/**
 * Created by Rayest on 2016/11/5 0005.
 */
// 演示服务
@Service
public class ControllerService {
    public String getTestContent() {
        return "This is the test content";
    }
}

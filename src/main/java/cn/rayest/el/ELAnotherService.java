package cn.rayest.el;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * Created by Rayest on 2016/11/5 0005.
 */
@Service
public class ELAnotherService {
    @Value("其他类的属性")
    private String another; // 注入普通字符串

    public String getAnother() {
        return another;
    }

    public void setAnother(String another) {
        this.another = another;
    }
}

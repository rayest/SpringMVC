package cn.rayest.scope;

import org.springframework.stereotype.Service;

/**
 * Created by Rayest on 2016/11/5 0005.
 * singleton: 一个 spring 中只有一个 bean 实例
 */
@Service // 默认为 Singleton, 相当于 @Scope("singleton")
public class SingletonService {
}

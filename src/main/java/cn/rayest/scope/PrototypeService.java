package cn.rayest.scope;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

/**
 * Created by Rayest on 2016/11/5 0005.
 * prototype: 每次调用新建一个 bean 实例
 */
@Service
@Scope("prototype")
public class PrototypeService {
}

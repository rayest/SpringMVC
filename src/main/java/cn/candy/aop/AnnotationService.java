package cn.candy.aop;

import org.springframework.stereotype.Service;

/**
 * Created by Rayest on 2016/8/26 0026.
 */
@Service
public class AnnotationService {
    @Action(name="ע��ʽ���ص� add ����")
    public void add(){}
}

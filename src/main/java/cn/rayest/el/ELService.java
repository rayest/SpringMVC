package cn.rayest.el;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Service;

import java.io.IOException;

/**
 * Created by Rayest on 2016/11/5 0005.
 * 文件找不到错误 仍待解决
 */
@Service
// @PropertySource("classpath:../resources/el/el.properties") // 注入配置文件需要该注解，以指定文件地址
public class ELService {
    @Value("I loved you!") // 注入普通字符串
    private String normal;

    @Value("#{systemProperties['os.name']}") // 注入操作系统属性
    private String operationSystemName;

    @Value("#{T(java.lang.Math).random() * 100.0}") // 注入表达式结果
    private double randomNumber;

    @Value("#{ELAnotherService.another}") // 注入其他 bean 的属性
    private String fromAnother;

    @Value("https://www.baidu.com") // 注入网址资源
    private Resource elUrl;

//    @Value("${lover.name}") // 注入配置文件
//    private String loverName;

    @Autowired
    private Environment environment; // 注入配置文件

//    @Value("classpath:../resources/el/el.txt") // 注入配置文件，唔需要 @PropertySource 注解，但需要注入 PropertySourcesPlaceholderConfigurer 的bean
//    private Resource elFile;

    @Bean // 注入配置文件
    public static PropertySourcesPlaceholderConfigurer propertyConfigurer() {
        return new PropertySourcesPlaceholderConfigurer();
    }

    public void outputResource() {
        try {
            System.out.println(normal);
            System.out.println(operationSystemName);
            System.out.println(randomNumber);
            System.out.println(fromAnother);
//            System.out.println(IOUtils.toString(elFile.getInputStream()));
            System.out.println(IOUtils.toString(elUrl.getInputStream()));
//            System.out.println(loverName);
//            System.out.println(environment.getProperty("lover.age"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

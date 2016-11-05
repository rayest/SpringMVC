package cn.rayest.springMVCTest;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Created by Rayest on 2016/11/5 0005.
 */
@Configuration
@EnableWebMvc
@EnableScheduling
@ComponentScan("cn.rayest.springMVCTest")
public class ControllerConfigure extends WebMvcConfigurerAdapter {
}

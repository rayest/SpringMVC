package cn.rayest.springMVCTest;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.mock.web.MockHttpSession;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

/**
 * Created by Rayest on 2016/11/5 0005.
 */
// 测试用例
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = ControllerConfigure.class)
@WebAppConfiguration // 用来声明加载的 ApplicationContext 是一个 WebApplicationContext.它的属性指定的是 web 资源的位置，默认为 src/main/webapp
public class ControllerIntegrationTest {

    private MockMvc mockMvc; // 模拟 MVC 对象

    @Autowired
    private ControllerService controllerService; // 注入 spring 的 Bean

    @Autowired
    WebApplicationContext webApplicationContext; // 注入 WebApplicationContext

    @Autowired
    MockHttpSession mockHttpSession; // 注入模拟的 http session

    @Autowired
    MockHttpServletRequest mockHttpServletRequest; // 注入模拟的 http request

    @Before
    public void setUp() throws Exception {
        // 初始化 MockMvc
        this.mockMvc = MockMvcBuilders.webAppContextSetup(this.webApplicationContext).build();
    }

    @Test
    public void testNormalController() throws Exception {
        mockMvc.perform(get("/normal")) // 模拟向 /normal 进行 get 请求
                .andExpect(status().isOk()) // 预期控制返回状态为 200
                .andExpect(view().name("page")) // 预期 view 的名称为 page
                // .andExpect(forwardedUrl("/WEB-INF/jsps/page.jsp"))
                // 预期 model 中的值是 controllerService.getTestContent 返回值 “This is the test content”
                .andExpect(model().attribute("msg", controllerService.getTestContent()));
    }

    @Test
    public void testMyRestController() throws Exception {
        mockMvc.perform(get("/rest")) // 模拟向 /rest 进行 get 请求
                .andExpect(status().isOk())
                .andExpect(content().contentType("text/plain;charset=UTF-8")) // 预期返回值的媒体类型
                .andExpect(content().string(controllerService.getTestContent())); // 预期返回值的内容
    }
}

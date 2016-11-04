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
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = ControllerConfigure.class)
@WebAppConfiguration("src/main/resources")
public class ControllerIntegrationTest {

    private MockMvc mockMvc;

    @Autowired
    private ControllerService controllerService;

    @Autowired
    WebApplicationContext webApplicationContext;

    @Autowired
    MockHttpSession mockHttpSession;

    @Autowired
    MockHttpServletRequest mockHttpServletRequest;

    @Before
    public void setUp() throws Exception {
        this.mockMvc = MockMvcBuilders.webAppContextSetup(this.webApplicationContext).build();
    }

    @Test
    public void testNormalController() throws Exception {
        mockMvc.perform(get("/normal"))
                .andExpect(status().isOk())
                .andExpect(view().name("page"))
                // .andExpect(forwardedUrl("/WEB-INF/jsps/page.jsp"))
                .andExpect(model().attribute("msg", controllerService.getTestContent()));
    }

    @Test
    public void testMyRestController() throws Exception {
        mockMvc.perform(get("/testRest"))
                .andExpect(status().isOk())
                .andExpect(content().contentType("text/plain;charset=UTF-8"))
                .andExpect(content().string(controllerService.getTestContent()));
    }
}

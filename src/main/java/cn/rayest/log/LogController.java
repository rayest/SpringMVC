package cn.rayest.log;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.EnvironmentAware;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Rayest on 2016/8/20 0020.
 */
@Controller
public class LogController implements EnvironmentAware {
    private Environment environment = null;
    public void setEnvironment(Environment environment) {
        this.environment = environment;
    }

    private final Log logger = LogFactory.getLog(LogController.class);

    @RequestMapping(value = "/go", method = RequestMethod.GET)
    public String index(Model model) {
        logger.info("====== processed by index ======");
        model.addAttribute("message", "Go Go Go!");
        return "go";
    }
}

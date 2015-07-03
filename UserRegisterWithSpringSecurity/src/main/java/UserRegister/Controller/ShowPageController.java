package UserRegister.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by KAJIWARAYutaka on 2015/05/02.
 */
@Controller
@RequestMapping(value="/")
public class ShowPageController {
    @RequestMapping(method = RequestMethod.GET)
    public String pageShow() {
        return "index";
    }

    @RequestMapping(value = "/loginSuccess", method = RequestMethod.GET)
    public String loginSuccessPageShow() {
        return "loginSuccess";
    }
}

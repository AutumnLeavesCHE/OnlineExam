package cheyinshu.exam.controller.usercontroller;

import cheyinshu.exam.models.user.Teacher;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("user")
public class UserController {
    private static final Logger LOGGER = LoggerFactory.getLogger(UserController.class);

    @ResponseBody
    @RequestMapping(value = {"test1"}, method = RequestMethod.GET)
    public Teacher findUserById(Long id) {
        LOGGER.info("入参id:{}", id);
        return null;
    }
}

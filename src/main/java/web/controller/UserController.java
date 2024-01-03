package web.controller;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import web.Service.UserService;
import org.springframework.stereotype.Controller;
import web.Service.UserServiceImpl;
import web.model.User;

import java.util.ArrayList;
import java.util.List;

@Controller
public class UserController {

    private UserService userService = new UserServiceImpl();

    @RequestMapping(method = RequestMethod.GET, name = "Users", value = "/users")
    public String printUsers(ModelMap model) {
        User user = new User("Ivan", 20, "Ivanov");
        List<User> users = new ArrayList<>();
        users.add(user);
        model.addAttribute("People", users);
        return "users";
    }

}

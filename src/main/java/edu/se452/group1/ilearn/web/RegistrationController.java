package edu.se452.group1.ilearn.web;

import edu.se452.group1.ilearn.data.entity.User;
import edu.se452.group1.ilearn.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class RegistrationController {

    @Autowired
    private UserService userService;

    @PostMapping("/user")
    public String registerUser(@PathVariable User user) {
        userService.save(user);
        return "home";
    }
}

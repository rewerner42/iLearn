package edu.se452.group1.ilearn.web;

import edu.se452.group1.ilearn.data.entity.User;
import edu.se452.group1.ilearn.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/user/")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping(value = "")
    public List<User> listAllUsers() {
        return userService.findAll();
    }


    @GetMapping(value = "{id}")
    public String findById(@PathVariable long id, Model model) {
        model.addAttribute("user", userService.findById(id));
        return "user";
    }
}

package com.project.bd.error.controller;

import com.project.bd.error.model.User;
import com.project.bd.error.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class DashboardController {

    private final UserService userService;

    public DashboardController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/dashboard")
    public String getAllUser(Model model)
    {
        List<User> userList=userService.getAll();
        model.addAttribute("userList",userList);
        return "dashboard";


    }
}

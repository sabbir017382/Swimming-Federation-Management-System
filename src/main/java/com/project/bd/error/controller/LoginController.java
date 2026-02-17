package com.project.bd.error.controller;

import com.project.bd.error.dto.LoginDto;
import com.project.bd.error.dto.RegistrationDto;
import com.project.bd.error.service.InstructorService;
import com.project.bd.error.service.UserService;
import org.apache.catalina.User;
import org.apache.juli.logging.Log;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LoginController {
    private final InstructorService instructorService;
    private final UserService userService;

    public LoginController(InstructorService instructorService, UserService userService) {
        this.instructorService = instructorService;
        this.userService = userService;
    }

    @GetMapping("/login")
    public String loginPage(Model model)

    {
        model.addAttribute("dto",new LoginDto());
        return "login";
    }
    @PostMapping("/loginSuccess")
    public String login(@ModelAttribute LoginDto dto,Model model){

        return "login";
    }













}

package com.project.bd.error.controller;

import com.project.bd.error.dto.LoginDto;
import com.project.bd.error.dto.RegistrationDto;
import com.project.bd.error.model.User;
import com.project.bd.error.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestAttribute;

@Controller
public class RegistrationController {

    private final UserService userService;

    public RegistrationController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/register")
    public String registration(Model model){

        model.addAttribute("dto" ,new RegistrationDto());
        return "register";

    }

    @PostMapping("/saveRegistration")
    public String saveRegistration(@ModelAttribute RegistrationDto dto, Model model) {
        User user = new User();
        user.setName(dto.getName());
        user.setEmail(dto.getEmail());
        user.setUserName(dto.getUserName());
        user.setPassword(dto.getPassword());

        userService.registration(user);
        LoginDto loginDto=new LoginDto();
        loginDto.setRegistrationSuccessful(true);
        model.addAttribute("dto",loginDto);
        return "login";
    }







}

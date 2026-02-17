package com.project.bd.error.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProfileController {
    @GetMapping("/adminProfile")
    public String profile(){
        return "adminProfile";
    }
}

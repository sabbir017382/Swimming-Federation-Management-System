package com.project.bd.error.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AdmissionController {

    @GetMapping("/admissionForm")
    public String admission()
    {
        return "admissionForm";
    }
}

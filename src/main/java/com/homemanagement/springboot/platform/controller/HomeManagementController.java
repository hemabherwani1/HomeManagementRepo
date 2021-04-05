package com.homemanagement.springboot.platform.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeManagementController {
    @RequestMapping("/")
    public String index() {
        return "Welcome to Home Management App";
    }

}

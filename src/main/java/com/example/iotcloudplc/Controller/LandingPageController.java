package com.example.iotcloudplc.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LandingPageController {
    @GetMapping("/")
    public String homePage(){
        return "homepage";
    }

    @GetMapping("/admin")
    public String adminMainPage(){
        return "mainadmin";
    }
}

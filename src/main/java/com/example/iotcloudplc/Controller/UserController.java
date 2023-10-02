package com.example.iotcloudplc.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @GetMapping("/welcome")
    public String helloWorld(){
        return "Welcome user";
    }
    
}

package com.junior.spring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api")
public class controll {
    
    @GetMapping("/hello")
    public String getMethodName() {
        return "Ola mundo";
    }

}

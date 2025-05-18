package com.jafar.receipemanager.checker;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthChecker {
    @GetMapping("health")
    public String healthCheck(){
        return "Ok! Running";
    }
}

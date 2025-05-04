package com.crm.collab.dashboard.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/dashboard")
@RestController
public class HealthCheck {

@GetMapping("/health")
    public String getHealth(){
    return "health is up and running";
}

}

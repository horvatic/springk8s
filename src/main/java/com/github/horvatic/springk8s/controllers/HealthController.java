package com.github.horvatic.springk8s.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthController {
    @GetMapping("/springk8s/health")
    public String health() {
      return String.format("OK");
    }
}
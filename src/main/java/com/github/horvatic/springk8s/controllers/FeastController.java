package com.github.horvatic.springk8s.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.context.annotation.Bean;
import reactor.core.publisher.Mono;

import com.github.horvatic.springk8s.services.IFeastService;

@RestController
public class FeastController {

    private IFeastService _feastService;

    @Autowired
    public FeastController(IFeastService feastService) {
       _feastService = feastService;
    }

    @GetMapping("/springk8s/feast/driverhourlyfeatures")
    public Mono<String> driverHourlyFeatures() {
      return _feastService.getFeatures();
    }
}
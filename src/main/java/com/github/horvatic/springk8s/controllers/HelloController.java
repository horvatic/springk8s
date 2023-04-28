package com.github.horvatic.springk8s.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.context.annotation.Bean;

import com.github.horvatic.springk8s.services.IHelloService;


@RestController
public class HelloController {

    private IHelloService _helloService;

    @Autowired
    public HelloController(IHelloService helloService) {
       _helloService = helloService;
    }

    @GetMapping("/springk8s/hello")
    public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
      return _helloService.getHello(name);
    }

}
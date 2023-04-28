package com.github.horvatic.springk8s.services;

import org.springframework.stereotype.Service;

@Service
public class HelloService implements IHelloService {
    public String getHello(String name) {
        return String.format("Hello %s!!!!!!!!!", name);
    }
}
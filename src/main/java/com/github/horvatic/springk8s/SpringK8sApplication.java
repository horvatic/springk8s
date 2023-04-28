package com.github.horvatic.springk8s;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.github.horvatic.springk8s.controllers.*;

@SpringBootApplication
public class SpringK8sApplication {
    public static void main(String[] args) {
      SpringApplication.run(SpringK8sApplication.class, args);
    }
}
package com.github.horvatic.springk8s;

import org.springframework.boot.SpringApplication;
import com.github.horvatic.springk8s.controllers.*;

public class SpringK8sApplication {
    public static void main(String[] args) {
      Class[] controllers = {HealthController.class, HelloController.class};
      SpringApplication.run(controllers, args);
    }
}
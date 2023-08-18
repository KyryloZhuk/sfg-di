package com.kjcdg.sfgdi.controllers;

import com.kjcdg.sfgdi.services.GreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class DemoController {

    private final GreetingService greetingService;

    public DemoController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello(){
        return greetingService.sayGreeting();
    }

}

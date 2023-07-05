package com.kjcdg.sfgdi.controllers;

import org.springframework.stereotype.Controller;

@Controller
public class DemoController {

    public String sayHello(){
        System.out.println("Hello there...");
        return "General Kenobi!";
    }

}

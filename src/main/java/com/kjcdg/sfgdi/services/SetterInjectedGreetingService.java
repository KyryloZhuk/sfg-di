package com.kjcdg.sfgdi.services;

import org.springframework.stereotype.Service;

@Service
public class SetterInjectedGreetingService implements GreetingService{

    @Override
    public String sayGreeting() {
        return "Oh, Hello there! Said the setter";
    }
}

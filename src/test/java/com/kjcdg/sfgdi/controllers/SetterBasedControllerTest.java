package com.kjcdg.sfgdi.controllers;

import com.kjcdg.sfgdi.services.ConstructorGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SetterBasedControllerTest {

    SetterBasedController setterBasedController;

    @BeforeEach
    void setUp() {
        setterBasedController = new SetterBasedController();
        setterBasedController.setGreetingService(new ConstructorGreetingService());
    }

    @Test
    void getGreeting() {
        System.out.println(setterBasedController.getGreeting());
    }
}
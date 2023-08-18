package com.kjcdg.sfgdi;

import com.kjcdg.sfgdi.controllers.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(SfgDiApplication.class, args);

		DemoController demoController = (DemoController) context.getBean("demoController");
		I18nController i18nController = (I18nController) context.getBean("i18nController");

		System.out.println("======== Profile bean");
		System.out.println(i18nController.sayHello() + "\r\n");

		System.out.println("======= Primary bean");
		System.out.println(demoController.sayHello() + "\r\n");

		System.out.println("======= Property");
		PropertyInjectedController propertyInjectedController = (PropertyInjectedController) context.getBean("propertyInjectedController");
		System.out.println(propertyInjectedController.getGreeting() + "\r\n");

		System.out.println("======= Setter");
		SetterBasedController setterBasedController = (SetterBasedController) context.getBean("setterBasedController");
		System.out.println(setterBasedController.getGreeting() + "\r\n");

		System.out.println("======= Constructor");
		ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) context.getBean("constructorInjectedController");
		System.out.println(constructorInjectedController.getGreeting() + "\r\n");


	}

}

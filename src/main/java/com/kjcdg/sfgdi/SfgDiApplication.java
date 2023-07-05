package com.kjcdg.sfgdi;

import com.kjcdg.sfgdi.controllers.ConstructorInjectedController;
import com.kjcdg.sfgdi.controllers.DemoController;
import com.kjcdg.sfgdi.controllers.PropertyInjectedController;
import com.kjcdg.sfgdi.controllers.SetterBasedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(SfgDiApplication.class, args);

		DemoController demoController = (DemoController) context.getBean("demoController");

		String greeting = demoController.sayHello();

		System.out.println(greeting + "\r\n");

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

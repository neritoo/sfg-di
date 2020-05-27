package com.gavilan.sfgdi;

import com.gavilan.sfgdi.controllers.ConstructorInjectedController;
import com.gavilan.sfgdi.controllers.MyController;
import com.gavilan.sfgdi.controllers.PropertyInjectedController;
import com.gavilan.sfgdi.controllers.SetterInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SfgDiApplication.class, args);

		// La instancia del controlador es creada por el context de Spring, el cual maneja las dependencias por nosotros,
		// y nosotros solo tenemos que pedirle a Spring por esa instancia.
		MyController myController = (MyController) ctx.getBean("myController");

		// Sin el Application Context deberíamos manejar nosotros mismos las dependencias a otras clases, y por ende
		// instanciar por nosotros mismos la clase MyController.
		//MyController myController = new MyController();

		String greeting = myController.sayHello();

		System.out.println(greeting);

		System.out.println("------------------- Property Injected Controller");

		PropertyInjectedController propertyInjectedController = (PropertyInjectedController) ctx.getBean("propertyInjectedController");

		System.out.println(propertyInjectedController.getGreeting());

		System.out.println("------------------- Setter Injected Controller");

		SetterInjectedController setterInjectedController = (SetterInjectedController) ctx.getBean("setterInjectedController");

		System.out.println(setterInjectedController.getGreeting());

		System.out.println("------------------- Constructor Injected Controller");

		ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) ctx.getBean("constructorInjectedController");

		System.out.println(constructorInjectedController.getGreeting());
	}

}

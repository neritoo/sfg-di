package com.gavilan.sfgdi.controllers;

import com.gavilan.sfgdi.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

/**
 * @author Ezequiel Gavilan
 * @project sfg-di
 */

@Controller
public class ConstructorInjectedController {

    private final GreetingService greetingService;

    /**
     * La anotacion @Qualifier nos permite decirle a Spring que implementación del GreetingService vamos a necesitar
     *
     * @param greetingService de constructorGreetingService.
     */
    public ConstructorInjectedController(@Qualifier("constructorGreetingService") GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    /**
     * Saludo usando ConstructorGreetingService que implementa la interfaz de GreetingService.
     *
     * @return String con saludo del constructorGreetingService.
     */
    public String getGreeting() {
        return greetingService.sayGreeting();
    }
}

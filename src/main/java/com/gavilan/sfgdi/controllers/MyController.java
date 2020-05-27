package com.gavilan.sfgdi.controllers;

import com.gavilan.sfgdi.services.GreetingService;
import org.springframework.stereotype.Controller;

/**
 * @author Ezequiel Gavilan
 * @project sfg-di
 */

/**
 * Controlador principal.
 */
@Controller
public class MyController {

    private final GreetingService greetingService;

    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    /**
     * Saludo usando GreetingService marcado con @Primary, sin uso de Qualifiers.
     *
     * @return String con saludo del servicio marcado como @Primary.
     */
    public String sayHello() {
        return greetingService.sayGreeting();
    }
}

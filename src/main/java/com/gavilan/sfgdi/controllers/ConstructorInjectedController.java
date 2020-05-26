package com.gavilan.sfgdi.controllers;

import com.gavilan.sfgdi.services.GreetingService;

/**
 * @author Ezequiel Gavilan
 * @project sfg-di
 */
public class ConstructorInjectedController {

    private final GreetingService greetingService;

    public ConstructorInjectedController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting() {
        return greetingService.sayGreeting();
    }
}

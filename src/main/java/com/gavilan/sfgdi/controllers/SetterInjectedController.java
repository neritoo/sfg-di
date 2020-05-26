package com.gavilan.sfgdi.controllers;

import com.gavilan.sfgdi.services.GreetingService;

/**
 * @author Ezequiel Gavilan
 * @project sfg-di
 */
public class SetterInjectedController {

    private GreetingService greetingService;

    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting() {
        return greetingService.sayGreeting();
    }
}

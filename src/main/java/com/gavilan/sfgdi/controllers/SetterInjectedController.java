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
public class SetterInjectedController {

    private GreetingService greetingService;

    @Qualifier("setterInjectedGreetingService")
    @Autowired
    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    /**
     *
     * @return String con saludo del setterInjectedGreetingService.
     */
    public String getGreeting() {
        return greetingService.sayGreeting();
    }
}

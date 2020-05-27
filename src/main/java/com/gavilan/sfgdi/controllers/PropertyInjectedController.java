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
public class PropertyInjectedController {

    @Qualifier("propertyInjectedGreetingService")
    @Autowired
    public GreetingService greetingService;

    /**
     *
     * @return String con saludo del propertyInjectedGreetingService.
     */
    public String getGreeting() {
        return greetingService.sayGreeting();
    }
}

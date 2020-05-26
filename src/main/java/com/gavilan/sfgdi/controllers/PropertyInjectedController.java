package com.gavilan.sfgdi.controllers;

import com.gavilan.sfgdi.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author Ezequiel Gavilan
 * @project sfg-di
 */
public class PropertyInjectedController {
    public GreetingService greetingService;

    public String getGreeting() {
        return greetingService.sayGreeting();
    }
}

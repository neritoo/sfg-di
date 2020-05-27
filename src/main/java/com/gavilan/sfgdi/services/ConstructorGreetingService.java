package com.gavilan.sfgdi.services;

import org.springframework.stereotype.Service;

/**
 * @author Ezequiel Gavilan
 * @project sfg-di
 */

@Service
public class ConstructorGreetingService implements GreetingService {

    /**
     * Saludo inyectado en ConstructorInjectedController.
     * @return String con saludo en ingles "Hello World".
     */
    @Override
    public String sayGreeting() {
        return "Hello World - Constructor";
    }
}

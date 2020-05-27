package com.gavilan.sfgdi.services;

import org.springframework.stereotype.Service;

/**
 * @author Ezequiel Gavilan
 * @project sfg-di
 */

@Service
public class GreetingServiceImpl implements GreetingService {

    /**
     * Saludo en ingles.
     * @return String con saludo en ingles "Hello World".
     */
    @Override
    public String sayGreeting() {
        return "Hello World";
    }
}

package com.gavilan.sfgdi.services;

/**
 * @author Ezequiel Gavilan
 * @project sfg-di
 */
public class GreetingServiceImpl implements GreetingService {

    /**
     * Método que saluda en ingles.
     * @return String con saludo en ingles "Hello World".
     */
    @Override
    public String sayGreeting() {
        return "Hello World";
    }
}

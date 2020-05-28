package com.gavilan.sfgdi.services;

import org.springframework.stereotype.Service;

/**
 * @author Ezequiel Gavilan
 *
 * Service identifica esta clase como un componente de Spring del estereotipo 'Service'.
 */
@Service
public class ConstructorGreetingService implements GreetingService {

    /**
     * Saludo inyectado en ConstructorInjectedController.
     *
     * @return String del saludo con DI del constructor.
     */
    @Override
    public String sayGreeting() {
        return "Hello World - Constructor";
    }
}

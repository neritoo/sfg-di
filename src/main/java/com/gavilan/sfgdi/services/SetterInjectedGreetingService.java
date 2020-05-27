package com.gavilan.sfgdi.services;

import org.springframework.stereotype.Service;

/**
 * @author Ezequiel Gavilan
 * @project sfg-di
 */

/**
 * Service identifica esta clase como un componente de Spring del estereotipo 'Service'.
 */
@Service
public class SetterInjectedGreetingService implements GreetingService {

    /**
     * Saludo inyectado en SetterInjectedController.
     *
     * @return String del saludo con DI basado en setter.
     */
    @Override
    public String sayGreeting() {
        return "Hello World - Setter";
    }
}

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
public class PropertyInjectedGreetingService implements GreetingService {

    /**
     * Saludo inyectado en PropertyInjectedController.
     *
     * @return String del saludo con DI de propiedad pública.
     */
    @Override
    public String sayGreeting() {
        return "Hello World - Property";
    }
}

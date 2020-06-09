package com.gavilan.sfgdi.services;

/**
 * @author Ezequiel Gavilan
 */

public class I18NSpanishGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hola Mundo - ES";
    }
}

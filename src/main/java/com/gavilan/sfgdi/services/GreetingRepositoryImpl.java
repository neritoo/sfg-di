package com.gavilan.sfgdi.services;

import org.springframework.stereotype.Component;

/**
 * @author Ezequiel Gavilán
 */

@Component
public class GreetingRepositoryImpl implements GreetingRepository {
    @Override
    public String getEnglishGreeting() {
        return "Hello World! - English service";
    }

    @Override
    public String getSpanishGreeting() {
        return "Hola mundo! - Spanish service";
    }

    @Override
    public String getPrimaryGreeting() {
        return "Hello World! - FROM the Primary service";
    }
}

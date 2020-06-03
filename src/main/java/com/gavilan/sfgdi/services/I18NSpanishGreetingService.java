package com.gavilan.sfgdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * @author Ezequiel Gavilan
 */

public class I18NSpanishGreetingService implements GreetingService {

    private GreetingRepository greetingRepository;

    public I18NSpanishGreetingService(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    @Override
    public String sayGreeting() {
        return greetingRepository.getSpanishGreeting();
    }
}

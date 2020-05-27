package com.gavilan.sfgdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * @author Ezequiel Gavilan
 * @project sfg-di
 */

@Profile("EN")
@Service("i18nService")
public class I18NEnglishGreetingService implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hello World - EN";
    }
}

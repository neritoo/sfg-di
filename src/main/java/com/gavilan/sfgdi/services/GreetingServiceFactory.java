package com.gavilan.sfgdi.services;

/**
 * @author Ezequiel Gavilán
 */
public class GreetingServiceFactory {

    private GreetingRepository greetingRepository;

    public GreetingServiceFactory(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    public GreetingService createGreetingService(String lang) {

        switch (lang) {
            case "en":
                return new I18NEnglishGreetingService(greetingRepository);
            case "es":
                return new I18NSpanishGreetingService(greetingRepository);
            case "primary":
                return new PrimaryGreetingService(greetingRepository);
            default:
                return new I18NEnglishGreetingService(greetingRepository);
        }
    }
}

package com.gavilan.sfgdi.services;

/**
 * @author Ezequiel Gavilán
 */
public class GreetingServiceFactory {

    public GreetingService createGreetingService(String lang) {
        switch (lang) {
            case "en":
                return new I18NEnglishGreetingService();
            case "es":
                return new I18NSpanishGreetingService();
            case "primary":
                return new PrimaryGreetingService();
            default:
                return new PrimaryGreetingService();
        }
    }

}

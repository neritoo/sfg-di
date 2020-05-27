package com.gavilan.sfgdi.services;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

/**
 * @author Ezequiel Gavilan
 * @project sfg-di
 */

/**
 * Service identifica esta clase como un componente de Spring del estereotipo 'Service'.
 * Primary identifica este servicio como el principal al momento de inyectarlo.
 */
@Primary
@Service
public class PrimaryGreetingService implements GreetingService {

    /**
     * Saluda desde la clase marcada como Primary Bean, lo que permite identificar a ésta clase como el servicio primario
     *
     * en caso de no encontrar ningún Qualifier.
     *
     * @return String saludo del Primary Bean.
     */
    @Override
    public String sayGreeting() {
        return "Hello World - From the PRIMARY Bean";
    }
}

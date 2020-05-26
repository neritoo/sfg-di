package com.gavilan.sfgdi.controllers;

import org.springframework.stereotype.Controller;

/**
 * @author Ezequiel Gavilan
 * @project sfg-di
 */

@Controller
public class MyController {

    public String sayHello() {
        System.out.println("Hola mundo!!");

        return "Hola wachos";
    }
}

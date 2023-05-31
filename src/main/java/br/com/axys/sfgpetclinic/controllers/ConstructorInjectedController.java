package br.com.axys.sfgpetclinic.controllers;

import br.com.axys.sfgpetclinic.services.GreetingService;

public class ConstructorInjectedController {
    private final GreetingService greetingService;

    public ConstructorInjectedController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting(){
        return greetingService.SayGreeting();
    }
}

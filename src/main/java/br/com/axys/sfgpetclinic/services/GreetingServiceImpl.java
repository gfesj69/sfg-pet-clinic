package br.com.axys.sfgpetclinic.services;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements GreetingService {
    @Override
    public String SayGreeting() {
        return "Hello World";
    }
}

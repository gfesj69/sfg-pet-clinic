package br.com.axys.sfgpetclinic;

import br.com.axys.sfgpetclinic.controllers.ConstructorInjectedController;
import br.com.axys.sfgpetclinic.controllers.MyController;
import br.com.axys.sfgpetclinic.controllers.PropertyInjectionController;
import br.com.axys.sfgpetclinic.controllers.SetterInjectedController;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfgPetClinicApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(SfgPetClinicApplication.class, args);

        MyController myController = (MyController) ctx.getBean("myController");

        String greetings = myController.sayHello();

        System.out.println(greetings);

        System.out.println("\"--------- Property");
        PropertyInjectionController propertyInjectionController = (PropertyInjectionController) ctx.getBean("PropertyInjectionController");
        System.out.println(propertyInjectionController.getGreeting());
/*
        PropertyInjectionController propertyInjectedController = (PropertyInjectionController) ctx.getBean("propertyInjectedController");
        System.out.println(propertyInjectedController.getGreeting());

        System.out.println("\"--------- Setter");
        SetterInjectedController setterInjectedController = (SetterInjectedController) ctx.getBean("setterInjectedController");
        System.out.println(setterInjectedController.getGreeting());

        System.out.println("\"--------- Constructor" );
        ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) ctx.getBean("constructorInjectedController");
        System.out.println(constructorInjectedController.getGreeting());
*/
    }

}

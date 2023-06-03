package br.com.axys.sfgpetclinic;

import br.com.axys.sfgpetclinic.controllers.ConstructorInjectedController;
import br.com.axys.sfgpetclinic.controllers.MyController;
import br.com.axys.sfgpetclinic.controllers.PropertyInjectedController;
import br.com.axys.sfgpetclinic.controllers.SetterInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfgPetClinicApplication {


    public static void main(String[] args) {
        Boolean Debug = false;

        ApplicationContext ctx = SpringApplication.run(SfgPetClinicApplication.class, args);

        MyController myController = (MyController) ctx.getBean("myController");

        String greetings = myController.sayHello();

        System.out.println(greetings);

        /*
            Just a piece of code to show all Beans and discovery what happens to do not find de Property Bean???
         */
        if(Debug) {
            String[] allBeanNames = ctx.getBeanDefinitionNames();
            Integer x = 0;
            for (String beanName : allBeanNames) {
                System.out.println("Bean " + x.toString() + ": " + beanName);
                x++;
            }
        }

        /*
            Here we have a mistery, the Beam was defined witch capital Letter, but for some reason, that I do not have
            a clue, the Spring Boot put the first letter a small one.....
         */
        System.out.println("\"--------- Property");
        //PropertyInjectedController propertyInjectionController = (PropertyInjectedController) ctx.getBean("PropertyInjectedController");
        PropertyInjectedController propertyInjectionController = (PropertyInjectedController) ctx.getBean("propertyInjectedController");
        System.out.println(propertyInjectionController.getGreeting());

        System.out.println("\"--------- Setter");
        SetterInjectedController setterInjectedController = (SetterInjectedController) ctx.getBean("setterInjectedController");
        System.out.println(setterInjectedController.getGreeting());

        System.out.println("\"--------- Constructor" );
        ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) ctx.getBean("constructorInjectedController");
        System.out.println(constructorInjectedController.getGreeting());

    }
}

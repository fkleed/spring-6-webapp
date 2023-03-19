package guru.springframework.spring6webapp;

import guru.springframework.spring6webapp.controllers.greeting.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Spring6WebappApplication {

    public static void main(String[] args) {

        ApplicationContext ctx = SpringApplication.run(Spring6WebappApplication.class, args);

        MyController myController = ctx.getBean(MyController.class);

        System.out.println("From main method");

        System.out.println(myController.sayHello());
    }

}

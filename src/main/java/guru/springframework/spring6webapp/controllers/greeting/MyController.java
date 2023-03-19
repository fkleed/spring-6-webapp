package guru.springframework.spring6webapp.controllers.greeting;

import guru.springframework.spring6webapp.services.greeting.GreetingService;
import guru.springframework.spring6webapp.services.greeting.GreetingServiceImpl;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    private final GreetingService greetingService;

    public MyController() {
        this.greetingService = new GreetingServiceImpl();
    }

    public String sayHello() {
        System.out.println("I'm the controller!");

        return greetingService.sayGreeting();
    }
}

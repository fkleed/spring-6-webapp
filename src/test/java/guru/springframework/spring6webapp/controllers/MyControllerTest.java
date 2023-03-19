package guru.springframework.spring6webapp.controllers;

import guru.springframework.spring6webapp.controllers.greeting.MyController;
import org.junit.jupiter.api.Test;

class MyControllerTest {

    @Test
    void sayHello() {

        MyController myController = new MyController();

        System.out.println(myController.sayHello());
    }
}
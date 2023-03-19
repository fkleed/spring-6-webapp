package guru.springframework.spring6webapp.controllers.faux;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@SpringBootTest
class MyFauxControllerTestDev {

    @Autowired
    MyFauxController myFauxController;

    @Test
    void getStringFromDataSource() {
        System.out.println(myFauxController.getStringFromDataSource());
    }

}
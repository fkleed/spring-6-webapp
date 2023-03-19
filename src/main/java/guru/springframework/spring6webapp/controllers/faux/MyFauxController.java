package guru.springframework.spring6webapp.controllers.faux;

import guru.springframework.spring6webapp.services.faux.FauxService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class MyFauxController {

    private final FauxService fauxService;


    public MyFauxController(@Qualifier("fauxService") FauxService fauxService) {
        this.fauxService = fauxService;
    }

    public String getStringFromDataSource() {
        return fauxService.getStringFromDatasource();
    }
}

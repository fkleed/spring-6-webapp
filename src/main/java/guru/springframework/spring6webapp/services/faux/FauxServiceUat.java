package guru.springframework.spring6webapp.services.faux;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("UAT")
@Service("fauxService")
public class FauxServiceUat implements FauxService{

    @Override
    public String getStringFromDatasource() {
        return "uat";
    }
}

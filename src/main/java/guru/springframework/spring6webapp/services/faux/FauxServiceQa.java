package guru.springframework.spring6webapp.services.faux;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("QA")
@Service("fauxService")
public class FauxServiceQa implements FauxService{

    @Override
    public String getStringFromDatasource() {
        return "qa";
    }
}

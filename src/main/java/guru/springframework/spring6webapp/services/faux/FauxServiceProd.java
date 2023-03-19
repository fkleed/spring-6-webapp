package guru.springframework.spring6webapp.services.faux;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("PROD")
@Service("fauxService")
public class FauxServiceProd implements FauxService{

    @Override
    public String getStringFromDatasource() {
        return "prod";
    }
}

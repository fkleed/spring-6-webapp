package guru.springframework.spring6webapp.services.faux;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"DEV", "default"})
@Service("fauxService")
public class FauxServiceDev implements FauxService{

    @Override
    public String getStringFromDatasource() {
        return "dev";
    }
}

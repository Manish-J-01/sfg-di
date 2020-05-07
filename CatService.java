package manish.springframework.sfgdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Profile({"Cat","default"})
@Service
public class CatService implements PetService{

    @Override
    public String getPetType() {
        return "Cat is the best-CAT";
    }
}

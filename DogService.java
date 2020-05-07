package manish.springframework.sfgdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Profile("dog")
@Service
public class DogService implements PetService{

    @Override
    public String getPetType() {
        return "Dog is the best-DOG";
    }
}

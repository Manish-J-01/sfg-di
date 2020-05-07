package manish.springframework.sfgdi.controllers;

import manish.springframework.sfgdi.services.PetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class PetController {


    @Autowired
    private final PetService petService;

    public PetController( PetService petService) {
        this.petService = petService;
    }

    public String getPetType() {
        return petService.getPetType();
    }
}

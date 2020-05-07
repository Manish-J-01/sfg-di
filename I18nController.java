package manish.springframework.sfgdi.controllers;

import manish.springframework.sfgdi.services.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class I18nController {

    private GreetingService greetingService;

    public I18nController(@Qualifier("I18nService")GreetingService greetingService) {
        this.greetingService = greetingService;
    }
    public String sayHello(){
       return greetingService.sayGreeting();
    }
}

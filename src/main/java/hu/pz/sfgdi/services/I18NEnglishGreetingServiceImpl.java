package hu.pz.sfgdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("EN")
@Service("I18NService")
public class I18NEnglishGreetingServiceImpl implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hi - EN";
    }
}

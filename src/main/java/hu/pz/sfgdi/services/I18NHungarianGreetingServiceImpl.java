package hu.pz.sfgdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("HU")
@Service("I18NService")
public class I18NHungarianGreetingServiceImpl implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Jónapot kívánok Hölgyek, Urak! - HU";
    }
}

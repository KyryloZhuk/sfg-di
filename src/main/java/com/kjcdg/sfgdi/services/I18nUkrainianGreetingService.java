package com.kjcdg.sfgdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("UA")
@Service("i18nService")
public class I18nUkrainianGreetingService implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Здоровенькі були!";
    }
}

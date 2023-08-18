package com.kjcdg.sfgdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"DEF", "default"})
@Service("i18nService")
public class I18nDefaultGreetingService implements GreetingService {

    @Override
//    public String sayGreeting() {
//        return "\033[3m...unenthusiastic screeching...\033[3m";
//    }
    public String sayGreeting() {
        return "...unenthusiastic screeching...";
    }
}

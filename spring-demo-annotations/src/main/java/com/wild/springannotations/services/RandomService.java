package com.wild.springannotations.services;

import com.wild.springannotations.interfaces.FortuneService;
import org.springframework.stereotype.Component;

@Component
public class RandomService implements FortuneService {

    @Override
    public String getFortune() {
        return "RandomService: I'm RandomService class";
    }
}

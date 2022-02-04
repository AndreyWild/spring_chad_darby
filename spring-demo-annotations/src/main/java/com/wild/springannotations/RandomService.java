package com.wild.springannotations;

import org.springframework.stereotype.Component;

@Component
public class RandomService implements FortuneService{

    @Override
    public String getFortune() {
        return "RandomService: I'm RandomService class";
    }
}

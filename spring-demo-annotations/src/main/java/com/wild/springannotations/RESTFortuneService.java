package com.wild.springannotations;

import org.springframework.stereotype.Component;

@Component
public class RESTFortuneService implements FortuneService {
    @Override
    public String getFortune() {
        return "RESTFortuneService: I'm RESTFortuneService class";
    }
}

package com.wild.springannotations.services;

import com.wild.springannotations.interfaces.FortuneService;
import org.springframework.stereotype.Component;

@Component
public class DatabaseFortuneService implements FortuneService {

    @Override
    public String getFortune() {
        return "DatabaseFortuneService: I'm DatabaseFortuneService class";
    }
}

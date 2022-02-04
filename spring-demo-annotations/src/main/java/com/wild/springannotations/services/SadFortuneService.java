package com.wild.springannotations.services;

import com.wild.springannotations.interfaces.FortuneService;

public class SadFortuneService implements FortuneService {

    @Override
    public String getFortune() {
        return "Today is a sad day";
    }
}

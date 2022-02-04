package com.wild.springannotations.services;

import com.wild.springannotations.interfaces.FortuneService;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class RandomFortuneService implements FortuneService {

    // create an array of strings
    private String[] data = {
            "Beware of the wolf in sheep's clothing",
            "Diligence is the mothetr of good luck",
            "The journey is the reward"
    };

    // create the random number generator
    private Random myRandom = new Random();

    @Override
    public String getFortune() {
        // pick a random string form the array
        int index = myRandom.nextInt(data.length);

        String theFortune = data[index];

        return theFortune;
    }
}

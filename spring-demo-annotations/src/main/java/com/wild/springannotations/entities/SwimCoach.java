package com.wild.springannotations.entities;

import com.wild.springannotations.interfaces.Coach;
import com.wild.springannotations.interfaces.FortuneService;
import org.springframework.stereotype.Component;

@Component
public class SwimCoach implements Coach {

    FortuneService fortuneService;

    public SwimCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Swim 1000 meters as a warm up";
    }

    @Override
    public String getDailyFortune() {
        return "SwimCoach: " + fortuneService.getFortune();
    }
}

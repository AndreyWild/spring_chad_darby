package com.wild.springdemo;

public class CricketCoach implements Coach {

    private FortuneService fortuneService;

    private String emailAddress;

    private String team;

    public CricketCoach() {
        System.out.println("CricketCoach: inside no-args constructor");
    }

    public void setFortuneService(FortuneService fortuneService) {
        System.out.println("CricketCoach: inside setter method - setFortuneService()");
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Practice fast bowling for 15 minutes";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        System.out.println("CricketCoach: inside setter method - setEmailAddress()");
        this.emailAddress = emailAddress;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        System.out.println("CricketCoach: inside setter method - setTeam()");
        this.team = team;
    }

    @Override
    public String toString() {
        return "CricketCoach{" +
                "emailAddress='" + emailAddress + '\'' +
                ", team='" + team + '\'' +
                '}';
    }
}

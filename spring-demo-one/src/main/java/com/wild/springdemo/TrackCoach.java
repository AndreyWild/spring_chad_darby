package com.wild.springdemo;

public class TrackCoach implements Coach {

    private FortuneService fortuneService;

    public TrackCoach() {
    }

    public TrackCoach(FortuneService theFortuneService) {
        fortuneService = theFortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Run a hard 5k";
    }

    @Override
    public String getDailyFortune() {
        return "Just Do It: " + fortuneService.getFortune();
    }

    // add init method
    public void doMyStartupStaff(){
        System.out.println("TrackCoach: inside method doMyStartupStaff()");
    }

    // add a destroy method
    public void doMyCleanupStaffYoYo(){
        System.out.println("TrackCoach: inside method doMyCleanupStaffYoYo()");
    }
}

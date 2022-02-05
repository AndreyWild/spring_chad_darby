package com.wild.springannotations;

import com.wild.springannotations.config.SportConfig;
import com.wild.springannotations.entities.SwimCoach;
import com.wild.springannotations.interfaces.Coach;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SwimJavaConfigDemoApp {

    public static void main(String[] args) {

        // read spring config java class
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(SportConfig.class);

        // get the bean from spring container
        Coach theCoach = context.getBean("swimCoach", Coach.class);

        // call a method on the bean
        System.out.println(theCoach.getDailyWorkout());

        // call method to get the daily fortune
        System.out.println(theCoach.getDailyFortune());

        SwimCoach swimCoach = context.getBean("swimCoach", SwimCoach.class);

        // call our new swim coach methods ... has the props value injected
        System.out.println("email: " + swimCoach.getEmail() + " team: " + swimCoach.getTeam());

        //close the context
        context.close();
    }
}

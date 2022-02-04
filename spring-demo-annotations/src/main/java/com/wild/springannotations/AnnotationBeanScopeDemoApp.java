package com.wild.springannotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {

    public static void main(String[] args) {

        //load spring config file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        //retrieve bean from spring container
        Coach theCoach = context.getBean("tennisCoach", Coach.class);

        Coach alphaCoach = context.getBean("tennisCoach", Coach.class);

        //check if they are the same
        boolean resultOne = (theCoach == alphaCoach);

        boolean resultTwo = theCoach.equals(alphaCoach);

        //print of the result
        System.out.println("\nPointing to the same object: " + resultOne + "/" + resultTwo);

        System.out.println("\nMemory location for theCouch: " + theCoach);

        System.out.println("\nMemory location for alphaCouch: " + alphaCoach);

        //close the context
        context.close();
    }


}

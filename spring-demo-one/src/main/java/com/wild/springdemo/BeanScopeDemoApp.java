package com.wild.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");


        Coach theCoach = context.getBean("myCoach", Coach.class);

        Coach alphaCoach = context.getBean("myCoach", Coach.class);

        boolean result = theCoach == alphaCoach;

        System.out.println("==: \t\t" + result);
        System.out.println("equals: \t" + theCoach.equals(alphaCoach));
        System.out.println("Memory location address theCoach: \t\t" + theCoach);
        System.out.println("Memory location alphaCoach theCoach: \t" + alphaCoach);

        context.close();
    }
}

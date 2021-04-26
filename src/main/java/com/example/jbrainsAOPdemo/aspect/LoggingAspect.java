package com.example.jbrainsAOPdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class LoggingAspect {

    // Runs this method before the specified method in the Before annotation
    @Before("execution(public String com.example.jbrainsAOPdemo.animals.Dog.getName())")
    public void loggingAdviceDog() {
        System.out.println("Advice run. Get method called before execution for the Dog class");
    }

    // Runs this method before the specified method in the Before annotation
    @Before("execution(public String com.example.jbrainsAOPdemo.animals.Cat.getName())")
    public void loggingAdviceCat() {
        System.out.println("Advice run. Get method called before execution for the Cat class");
    }

    // Runs this method before the specified method in the Before annotation
    @Before("execution(public String com.example.jbrainsAOPdemo.animals.Bird.getName())")
    public void loggingAdviceBird() {
        System.out.println("Advice run. Get method called before execution for the Bird class");
    }
}

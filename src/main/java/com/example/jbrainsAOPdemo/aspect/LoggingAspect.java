package com.example.jbrainsAOPdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class LoggingAspect {

    // Runs this method before the specified method in the Before annotation
    @Before("execution(public String com.example.jbrainsAOPdemo.animals.Dog.getName())")
    public void loggingAdviceDog() {
        System.out.println("Advice run. Called before get method execution for the Dog class");
    }

    // Runs this method before the specified method in the Before annotation
    @Before("execution(public String com.example.jbrainsAOPdemo.animals.Cat.getName())")
    public void loggingAdviceCat() {
        System.out.println("Advice run. Called before get method execution for the Cat class");
    }

    // Runs this method before the specified method in the Before annotation
    @Before("execution(public String com.example.jbrainsAOPdemo.animals.Bird.getName())")
    public void loggingAdviceBird() {
        System.out.println("Advice run. Called before get method execution for the Bird class");
    }

    // Is executed before all methods starting with get. The first star (*) implies that is a method
    // of any type (returning any type or void) and the second (*) any method that starts with "get"
    @Before("execution(public * get*())")
    public void loggingAdviceAllGetters() {
        System.out.println("Advice run. Message displayed before all get methods");
    }
}

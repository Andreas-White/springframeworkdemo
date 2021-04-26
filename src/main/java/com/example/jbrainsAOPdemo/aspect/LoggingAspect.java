package com.example.jbrainsAOPdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LoggingAspect {

    // Runs this method before the specified method in the Before annotation
    @Before("execution(public * com.example.jbrainsAOPdemo.animals.Dog.get*())")
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
    // Regarding the parameters get() means 0 args, get(..) means 0 or more args and get(*) 1 or more args
    @Before("execution(public * getName())")
    public void loggingAdviceAllGetters() {
        System.out.println("Second Advice run. Message displayed before all get methods");
    }

    @Before("allGetters()")
    public void loggingAdviceAllPoints() {
        System.out.println("Third Advice run. Message displayed before all getName methods");
    }

    // Is if we need to apply the same wild cards for a lot of advices, instead of specifying the wild card
    // for each advice we can give as argument the name of the method annotated with @Pointcut
    @Pointcut("execution(public * com.example.jbrainsAOPdemo.animals.Dog.get*())")
    public void allGetters() {}
}

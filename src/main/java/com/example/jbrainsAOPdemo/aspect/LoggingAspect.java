package com.example.jbrainsAOPdemo.aspect;

import com.example.jbrainsAOPdemo.animals.Horse;
import org.aspectj.lang.JoinPoint;
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

    // This is best practise to combine Pointcuts
    @Before("allCat() && allDogGetters()")
    public void allCatGetters() {
        System.out.println("This advice will be displayed before every get method from Cat class is executed");
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

    @Before("allDogGetters()")
    public void loggingAdviceAllPoints() {
        System.out.println("Third Advice run. Message displayed before all getName methods");
    }

    // Displays a logging message before every executed makeNoise() method
    @Before("allNoises()")
    public void loggingAdviceAllNoises() {
        System.out.println("This advice displays the sounds that animals make");
    }

    @Before("allLion()")
    public void loggingAdviceAllLionMethods() {
        System.out.println("Messages displayed before a Lion method is executed");

    }

    @Before("allBird()")
    public void loggingAdviceAllBirdMethods() {
        System.out.println("Messages displayed before a Bird method is executed");
    }

    @Before("allHorseMethods()")
    public void loggingAdviceHorse(JoinPoint joinPoint) {
        System.out.println("Advice displayed before a horse method executes");
        Horse horse = (Horse) joinPoint.getTarget(); // In order to call a horse object to use
        System.out.println(joinPoint.getTarget());
    }

    // Is if we need to apply the same wild cards for a lot of advices, instead of specifying the wild card
    // for each advice we can give as argument the name of the method annotated with @Pointcut
    @Pointcut("execution(public * com.example.jbrainsAOPdemo.animals.Dog.get*())")
    public void allDogGetters() {}

    // Pointing the logging advice to all makeNoise() methods
    @Pointcut("execution(public * *.makeNoise())")
    public void allNoises() {}

    // by using execution we use method names as parameters
    @Pointcut("execution(* *com.example.jbrainsAOPdemo.animals.Lion.*(..))")
    public void allLion() {}

    // by using within we use class names as parameters
    @Pointcut("within(com.example.jbrainsAOPdemo.animals.Bird)")
    public void allBird() {}

    @Pointcut("within(com.example.jbrainsAOPdemo.animals.Cat)")
    public void allCat() {}

    @Pointcut("within(com.example.jbrainsAOPdemo.animals.Horse)")
    public void allHorseMethods() {}
}

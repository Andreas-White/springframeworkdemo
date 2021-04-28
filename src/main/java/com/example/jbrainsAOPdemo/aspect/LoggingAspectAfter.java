package com.example.jbrainsAOPdemo.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LoggingAspectAfter {

    @After("allCat() && allGetters()")
    public void loggingAdviceCatSetter() {
        System.out.println("This Logging Advice is displayed after the execution of a getter in Cat class");
    }

    @After("allCat() && allMakeNoise()")
    public void loggingAdviceCatMakeNoise() {
        System.out.println("This Logging Advice is displayed before the execution of the makeNoise() method in Cat class");
    }

    @Pointcut("within(com.example.jbrainsAOPdemo.animals.Cat)")
    public void allCat() {}

    @Pointcut("execution(* *makeNoise*())")
    public void allMakeNoise() {}

    @Pointcut("execution(* *get*(..))")
    public void allGetters() {}
}

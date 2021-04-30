package com.example.jbrainsAOPdemo.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LoggingAspectAround {

    @Before("beforeAfterMakeNoise()")
    public void loggingAdviceBeforeMakeNoise() {
        System.out.println("An advice displayed before execution of makeNoise() method");
    }

    @After("beforeAfterMakeNoise()")
    public void loggingAdviceAfterMakeNoise() {
        System.out.println("An advice displayed after execution of makeNoise() method");
    }

    @Pointcut("execution(* *makeNoise(..))")
    public void beforeAfterMakeNoise() {}
}

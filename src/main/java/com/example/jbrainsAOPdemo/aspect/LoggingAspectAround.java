package com.example.jbrainsAOPdemo.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

@Aspect
public class LoggingAspectAround {

    /*We can decide if the execution of the target method is going to be executed with statements before
    * ProceedingJoinPoint.proceed(); is reached. For example with if/else statements we can check that
    * certain requirements are met before proceeding to the execution of the target method.
    * Also with @Around we can modify the returned object, unlike to @AfterReturning*/
    @Around("@annotation(MyAroundAdvice)")
    public Object aroundAdvice(ProceedingJoinPoint joinPoint) {

        Object returnedValue = null;
        try {
            System.out.println("Before Advice");
            returnedValue = joinPoint.proceed();
            System.out.println("After Advice");
        } catch (Throwable throwable) {
            System.out.println("After throwing exception");
            throwable.printStackTrace();
        }
        System.out.println("After Finally");

        return returnedValue;
    }

}

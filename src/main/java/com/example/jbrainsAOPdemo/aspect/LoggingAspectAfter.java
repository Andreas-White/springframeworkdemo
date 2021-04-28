package com.example.jbrainsAOPdemo.aspect;

import com.example.jbrainsAOPdemo.animals.Horse;
import com.example.jbrainsAOPdemo.service.AnimalService;
import org.aspectj.lang.annotation.*;

@Aspect
public class LoggingAspectAfter {

    @After("allCat() && allGetters()")
    public void loggingAdviceCatSetter() {
        System.out.println("This Logging Advice is displayed after the execution of a getter in Cat class");
    }

    @After("allCat() && allMakeNoise()")
    public void loggingAdviceCatMakeNoise() {
        System.out.println("This Logging Advice is displayed after the execution of the makeNoise() method in Cat class");
    }

    @AfterReturning("afterSetter(name) && allCat()")
    public void loggingAdviceCatAfterReturning(String name) {
        System.out.println("This Logging Advice is displayed after the execution of a setter method in Cat class with " +
                "argument: " + name);
    }

    @AfterThrowing(value = "afterThrowHorse()", throwing = "exception")
    public void loggingAdviceHorseAfterThrow(RuntimeException exception) {
        System.out.println("This Logging Advice is displayed after an exception \"" + exception.getMessage() +"\" is thrown in Horse class");
    }

    @AfterReturning(value = "allMakeNoise()",returning = "name")
    public void loggingAdviceHorseReturnString(String name) {
        System.out.println("This Logging Advice is displayed after the returning of a String in Horse class" +
                " with value \"" + name +"\"");
    }

    @AfterReturning(value = "allHorse() && allGetters()",returning = "name")
    public void loggingAdviceHorseGetterReturnString(String name) {
        System.out.println("This logging advice displays the name of the horse as " + name);
    }

    @Pointcut("args(String)")
    public void afterThrowHorse() {}

    @Pointcut("args(name)")
    public void afterSetter(String name) {}

    @Pointcut("within(com.example.jbrainsAOPdemo.animals.Cat)")
    public void allCat() {}

    @Pointcut("within(com.example.jbrainsAOPdemo.animals.Horse)")
    public void allHorse() {}

    @Pointcut("execution(* *makeNoise*())")
    public void allMakeNoise() {}

    @Pointcut("execution(* *get*(..))")
    public void allGetters() {}
}

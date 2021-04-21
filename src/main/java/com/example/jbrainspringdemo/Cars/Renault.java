package com.example.jbrainspringdemo.Cars;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class Renault implements Car{

    private HorsePower hpR;
    private MessageSource messageSource;

    public MessageSource getMessageSource() {
        return messageSource;
    }

    @Autowired
    public void setMessageSource(MessageSource messageSource) {
        this.messageSource = messageSource;
    }

    public HorsePower getHpR() {
        return hpR;
    }

    @Autowired
    //@Resource  // same as Autowire
    @Qualifier("hpRenault")
    public void setHpR(HorsePower hpR) {
        this.hpR = hpR;
    }

    @Override
    public void drive() {
        System.out.println("Renault has " + getHpR().getHp() + " hp");
        System.out.println(messageSource.getMessage("greetingRenault",null,"Default1",null));
    }

    @PostConstruct
    public void initialiseRenault() {
        System.out.println("Init of Renault");
    }

    @PreDestroy
    public void destroyRenault() {
        System.out.println("Destroy of Renault");
    }
}

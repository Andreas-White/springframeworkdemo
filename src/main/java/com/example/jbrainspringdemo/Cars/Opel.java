package com.example.jbrainspringdemo.Cars;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;

@Component
public class Opel implements Car{

    private HorsePower hpO;
    private MessageSource messageSource;

    public MessageSource getMessageSource() {
        return messageSource;
    }

    @Autowired
    public void setMessageSource(MessageSource messageSource) {
        this.messageSource = messageSource;
    }

    public HorsePower getHpO() {
        return hpO;
    }

    @Autowired
    @Qualifier("opelHP")
    public void setHpO(HorsePower hpO) {
        this.hpO = hpO;
    }

    @Override
    public void drive() {
        System.out.println(messageSource.getMessage("opel",new  Object[] {getHpO().getHp()},"No hp",null));
        System.out.println(messageSource.getMessage("greetingOpel",null,"Default4",null));
    }
}

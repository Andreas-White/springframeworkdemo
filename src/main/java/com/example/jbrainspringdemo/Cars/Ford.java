package com.example.jbrainspringdemo.Cars;

import com.example.jbrainspringdemo.DriveEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;

@Component
public class Ford implements Car, ApplicationEventPublisherAware {

    private HorsePower hpF;
    private MessageSource messageSource;
    private ApplicationEventPublisher publisher;

    public MessageSource getMessageSource() {
        return messageSource;
    }

    @Autowired
    public void setMessageSource(MessageSource messageSource) {
        this.messageSource = messageSource;
    }

    public HorsePower getHpF() {
        return hpF;
    }

    @Autowired
    @Qualifier("fordR")
    public void setHpF(HorsePower hpF) {
        this.hpF = hpF;
    }

    @Override
    public void drive() {
        System.out.println(this.messageSource.getMessage("ford",new Object[] {getHpF().getHp()},"No hp",null));
        System.out.println(this.messageSource.getMessage("greetingFord",null,"Default3",null));
        DriveEvent event = new DriveEvent(this);
        publisher.publishEvent(event);
    }

    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
        this.publisher = applicationEventPublisher;
    }
}

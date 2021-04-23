package com.example.jbrainSpringdemo.Cars;

import com.example.jbrainSpringdemo.DriveEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class Renault implements Car, ApplicationEventPublisherAware {

    private HorsePower hpR;
    private MessageSource messageSource;
    private ApplicationEventPublisher publisher;

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
        System.out.println(messageSource.getMessage("renault",new Object[] {getHpR().getHp()},"No hp",null));
        System.out.println(messageSource.getMessage("greetingRenault",null,"Default1",null));
        DriveEvent event = new DriveEvent(this);
        publisher.publishEvent(event);
    }

    @PostConstruct
    public void initialiseRenault() {
        System.out.println("Init of Renault");
    }

    @PreDestroy
    public void destroyRenault() {
        System.out.println("Destroy of Renault");
    }

    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
        this.publisher = applicationEventPublisher;
    }
}

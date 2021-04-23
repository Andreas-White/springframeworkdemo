package com.example.jbrainSpringdemo.Cars;

import com.example.jbrainSpringdemo.DriveEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;

@Component
//@Service    // If it was a service class (in our case works the same as @Component)
//@Repository // If it was a data type (in our case works the same as @Component)
//@Controller   // If it was a controller (from MVC) type (in our case works the same as @Component)
public class Fiat implements Car, ApplicationEventPublisherAware {

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
    //@Resource  //same as autowire
    @Qualifier("fiatR")
    public void setHpF(HorsePower hpF) {
        this.hpF = hpF;
    }

    @Override
    public void drive() {
        System.out.println(messageSource.getMessage("fiat",new Object[] {getHpF().getHp()},"No hp",null));
        System.out.println(messageSource.getMessage("greetingFiat",null,"Default2",null));
        DriveEvent event = new DriveEvent(this);
        publisher.publishEvent(event);
    }

    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
        this.publisher = applicationEventPublisher;
    }
}

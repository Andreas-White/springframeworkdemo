package com.example.jbrainSpringdemo.Cars;

import com.example.jbrainSpringdemo.DriveEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;

@Component
public class Opel implements Car, ApplicationEventPublisherAware {

    private HorsePower hpO;
    private MessageSource messageSource;
    private ApplicationEventPublisher publisher;

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
        DriveEvent event = new DriveEvent(this);
        publisher.publishEvent(event);
    }

    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
        this.publisher = applicationEventPublisher;
    }
}

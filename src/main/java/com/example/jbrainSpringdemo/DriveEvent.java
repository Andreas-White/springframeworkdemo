package com.example.jbrainSpringdemo;

import org.springframework.context.ApplicationEvent;

public class DriveEvent extends ApplicationEvent {

    public DriveEvent(Object source) {
        super(source);
    }

    @Override
    public String toString() {
        return "Drive Event Occurred";
    }
}

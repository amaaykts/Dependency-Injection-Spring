package ru.github.amaaykts.al;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextClosedEvent;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.ContextStartedEvent;
import org.springframework.context.event.ContextStoppedEvent;

public class TestApplicationContextStarted implements ApplicationListener<ContextStoppedEvent> {
    public void onApplicationEvent(ContextStoppedEvent contextStartedEvent) {

        System.out.println("TestApplicationContextStarted");
        System.out.println("TestApplicationContextStarted");
        System.out.println("TestApplicationContextStarted");
        System.out.println("TestApplicationContextStarted");
        System.out.println("TestApplicationContextStarted");
        System.out.println("TestApplicationContextStarted");
    }
}

package org.katheer.event.handler;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStartedEvent;

public class ContextStartedEventHandler implements ApplicationListener<ContextStartedEvent> {
    static {
        System.out.println("ContextStartedEventHandler class loaded...");
    }
    @Override
    public void onApplicationEvent(ContextStartedEvent event) {
        System.out.println("Application Context is started...");
    }
}

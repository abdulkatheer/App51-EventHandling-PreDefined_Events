package org.katheer.event.handler;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStoppedEvent;

public class ContextStoppedEventHandler implements ApplicationListener<ContextStoppedEvent> {
    static {
        System.out.println("ContextStoppedEventHandler class loaded...");
    }

    @Override
    public void onApplicationEvent(ContextStoppedEvent event) {
        System.out.println("Application Context is stopped...");
    }
}

package org.katheer.event.handler;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextClosedEvent;

public class ContextClosedEventHandler implements ApplicationListener<ContextClosedEvent> {
    static {
        System.out.println("ContextClosedEventHandler is loaded...");
    }

    @Override
    public void onApplicationEvent(ContextClosedEvent event) {
        System.out.println("Application Context is closed...");
    }
}
package org.katheer.event.handler;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;

public class ContextRefreshedEventHandler implements ApplicationListener<ContextRefreshedEvent> {
    static {
        System.out.println("ContextRefreshedEventHandler class loaded...");
    }
    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        System.out.println("Application Context is refreshed...");
    }
}

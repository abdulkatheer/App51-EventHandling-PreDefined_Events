package org.katheer.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
    /*
    Built-in Events:
    ----------------
    There are five built-in events
    1) ContextStartedEvent
    2) ContextRefreshedEvent
    3) ContextStoppedEvent
    4) ContextClosedEvent
    5) RequestHandlingEvent (used in MVC applications)
     */
    static void printBeans(ApplicationContext context) {
        String[] beans = context.getBeanDefinitionNames();
        for(String bean : beans) {
            System.out.print(bean + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        ConfigurableApplicationContext context =
                new ClassPathXmlApplicationContext("org" +
                "/katheer/resource/applicationContext.xml");
        printBeans(context);

        context.stop();
        printBeans(context);

        context.start();
        printBeans(context);

        context.close();
        context.refresh();
        printBeans(context);
    }
}

package edu.nm.concurrency.aspect;

import org.springframework.stereotype.Component;

@Component
public class AspectDemoBean {

    public void methodOne() {
        System.out.println("We are calling method one");
    }

    public void methodTwo() {
        System.out.println("We are calling method two");
    }
}

package edu.nm.concurrency.patterns.behavioral.observer;

import java.util.List;

public class Subscriber implements Observer {

    private final String name;

    public Subscriber(String name) {
        this.name = name;
    }

    @Override
    public void handleEvent(List<String> vacancies) {
        System.out.println("Dear " + name + ",\nthese vacancies were changed:\n" + vacancies);
        System.out.println();
    }
}

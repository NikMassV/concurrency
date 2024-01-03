package edu.nm.concurrency.patterns.structural.adapter;

public interface Database {

    void insert();

    void update();

    void select();

    void remove();
}

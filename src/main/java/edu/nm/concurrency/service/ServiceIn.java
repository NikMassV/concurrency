package edu.nm.concurrency.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ServiceIn {

    @Transactional(
            isolation = Isolation.READ_UNCOMMITTED
    )
    public void doSomething() {

    }
}

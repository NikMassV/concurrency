package edu.nm.concurrency.aspect;

import org.springframework.stereotype.Service;


public class ShipmentService {
    @Log
    // this here is what's called a join point
    public void shipStuff(){
        System.out.println("In Service");
    }
}

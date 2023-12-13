package edu.nm.concurrency.aspect.closet;

import org.springframework.stereotype.Component;

@Component
public class AspectDemoBean {

    public String methodOne(String input) {
        String result = "We are calling method one";
        System.out.println(result);
        if(input.equalsIgnoreCase("Exception")) {
            throw new RuntimeException("Error for input" + input);
        }
        return result;
    }

    public String methodTwo() {
        String result = "We are calling method two";
        System.out.println(result);
        return result;
    }
}

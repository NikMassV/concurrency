package edu.nm.aspect.closet;

import edu.nm.concurrency.aspect.closet.AspectDemoBean;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = AspectDemoBean.class)
public class AspectDemoBeanTest {
    @Autowired
    AspectDemoBean aspectDemoBean;

    @Test
    void testBeforeLog() {
        try {
            aspectDemoBean.methodOne("Exception");
        } catch (Exception ex) {
            System.out.println("ERROR");
        }
        System.out.println();
        aspectDemoBean.methodTwo();
    }
}

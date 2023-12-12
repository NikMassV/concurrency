package edu.nm.aspect;

import edu.nm.concurrency.aspect.ShipmentService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = ShipmentService.class)
class AopApplicationTest {
    @Autowired
    ShipmentService shipmentService;

    @Test
    void testBeforeLog() {
        shipmentService.shipStuff();
    }
}

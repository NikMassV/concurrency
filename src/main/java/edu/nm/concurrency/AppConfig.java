package edu.nm.concurrency;

import edu.nm.concurrency.aspect.ShipmentService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
public class AppConfig {

    @Bean
    public ShipmentService shipmentService() {
        return new ShipmentService();
    }
}

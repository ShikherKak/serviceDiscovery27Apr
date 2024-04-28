package com.scaler.servicediscovery27apr;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class ServiceDiscovery27AprApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceDiscovery27AprApplication.class, args);
    }

}

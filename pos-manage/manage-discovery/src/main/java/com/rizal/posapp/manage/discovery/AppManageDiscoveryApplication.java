package com.rizal.posapp.manage.discovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class AppManageDiscoveryApplication {
    public static void main(String[] args) {
        SpringApplication.run(AppManageDiscoveryApplication.class, args);
    }
}

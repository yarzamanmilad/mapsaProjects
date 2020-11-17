package com.mapsa.configservice2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class ConfigService2Application {

    public static void main(String[] args) {
        SpringApplication.run(ConfigService2Application.class, args);
    }

}

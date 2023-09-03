package com.example.simplepostloginfeature;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class SimplePostLoginFeatureApplication {

    public static void main(String[] args) {
        SpringApplication.run(SimplePostLoginFeatureApplication.class, args);
    }

}

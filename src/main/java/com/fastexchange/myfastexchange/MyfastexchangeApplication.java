package com.fastexchange.myfastexchange;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class MyfastexchangeApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyfastexchangeApplication.class, args);
    }

}

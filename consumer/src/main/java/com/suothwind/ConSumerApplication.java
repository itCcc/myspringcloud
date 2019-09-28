package com.suothwind;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @author solang
 * @date 2019-09-27 10:45
 */
@SpringBootApplication
public class ConSumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConSumerApplication.class, args);
    }

    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}

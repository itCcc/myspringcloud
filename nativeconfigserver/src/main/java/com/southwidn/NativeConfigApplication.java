package com.southwidn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @author solang
 * @date 2019-09-28 11:48
 */
@EnableConfigServer
@SpringBootApplication
public class NativeConfigApplication {

    public static void main(String[] args) {
        SpringApplication.run(NativeConfigApplication.class, args);
    }
}

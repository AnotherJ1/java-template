package com.another.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Classname Server1Application
 * @Description TODO
 * @Date 2021/4/25 3:44 下午
 * @Created by another
 */
@SpringBootApplication
@EnableDiscoveryClient
public class Server1Application {

    public static void main(String[] args) {
        SpringApplication.run(Server1Application.class, args);
    }
}

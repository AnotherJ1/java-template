package com.another.server;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Classname Server2Application
 * @Description TODO
 * @Date 2021/4/25 5:23 下午
 * @Created by another
 */

@SpringBootApplication
@EnableDiscoveryClient
public class Server2Application {

    public static void main(String[] args) {
        SpringApplication.run(Server2Application.class, args);
    }
}

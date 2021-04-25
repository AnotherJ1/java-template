package com.another.server;

/**
 * @Classname Server1Application
 * @Description TODO
 * @Date 2021/4/25 3:44 下午
 * @Created by another
 */
@SpringBootApplication
@EnableDiscoveryClient
public class Server1Application {
    @Bean
    @LoadBalanced
    RestTemplate restTemplate() {
        return new RestTemplate();
    }

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }
}

package com.another.server.controller;


import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * @Classname TestController
 * @Description
 * @Date 2021/4/25 5:13 下午
 * @Created by another
 */
@RestController
@RequestMapping("/test1")
@CrossOrigin
@FeignClient("server1")
@Slf4j
public class TestController {


    @PostMapping(value = "/getRet")
    @ResponseBody
    Map inserTransportBatch(String param){
        log.info("进入到server1服务");
        return null;
    }
}

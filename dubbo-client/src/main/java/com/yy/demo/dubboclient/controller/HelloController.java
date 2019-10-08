package com.yy.demo.dubboclient.controller;

import com.yy.demo.service.HelloService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yy
 * @ProjectName spring-cloud-alibaba
 * @Description: TODO
 * @date 2019/8/19 16:07
 */
@RestController
public class HelloController {

    @Reference
    private HelloService helloService;

    @RequestMapping("/hello")
    public String hello(@RequestParam("name") String name){
        return helloService.hello(name);
    }


}

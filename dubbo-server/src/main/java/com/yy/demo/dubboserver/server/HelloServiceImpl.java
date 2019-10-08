package com.yy.demo.dubboserver.server;

import com.yy.demo.service.HelloService;
import org.apache.dubbo.config.annotation.Service;

/**
 * @author yy
 * @ProjectName spring-cloud-alibaba
 * @Description: TODO
 * @date 2019/8/19 15:30
 */
@Service
public class HelloServiceImpl implements HelloService {
    @Override
    public String hello(String name) {
        return "hello" + name;
    }
}

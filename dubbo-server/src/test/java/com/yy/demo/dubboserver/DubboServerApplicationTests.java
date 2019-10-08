package com.yy.demo.dubboserver;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

public class DubboServerApplicationTests {

    @Test
    public void contextLoads() {
        BigDecimal num1 = new BigDecimal("2000.00");
        BigDecimal num2 = new BigDecimal(222);

        System.out.println(num1.equals(num2));
        System.out.println(num1.compareTo(num2));

    }

}

package com.jk;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDubboConfiguration
public class ComsumerApplication {
    public static void main(String[] args){
        SpringApplication.run(ComsumerApplication.class,args);
        System.out.println("客户端启动成功！！！");
    }
}

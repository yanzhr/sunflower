package com.yan.sunflower;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SunflowerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SunflowerApplication.class, args);
        System.out.println("SunflowerApplication 启动成功！");
    }

}

package com.youhuang;

import org.springframework.boot.SpringApplication;

import com.youhuang.config.MyConfiguration;

public class Application {

    public static void main(String[] args) {
        SpringApplication.run(MyConfiguration.class, args);
    }
}

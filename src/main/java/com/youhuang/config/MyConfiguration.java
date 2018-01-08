package com.youhuang.config;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//@SpringBootApplication
@ComponentScan(basePackages="com.youhuang")
@EnableAutoConfiguration
@Configuration
public class MyConfiguration {

}

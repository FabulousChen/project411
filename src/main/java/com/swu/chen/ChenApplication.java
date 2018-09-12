package com.swu.chen;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication()
@MapperScan("com.swu.chen.mapper*")
public class ChenApplication {

    public static void main(String[] args) {
        SpringApplication.run(ChenApplication.class, args);
    }
}

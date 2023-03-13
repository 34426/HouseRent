package com.house.wym;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.house.wym.dao")
public class WymApplication {

    public static void main(String[] args) {
        SpringApplication.run(WymApplication.class, args);
    }

}

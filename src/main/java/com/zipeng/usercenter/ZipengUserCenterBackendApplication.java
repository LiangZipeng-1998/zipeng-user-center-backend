package com.zipeng.usercenter;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.zipeng.usercenter.mapper")
public class ZipengUserCenterBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZipengUserCenterBackendApplication.class, args);
    }

}

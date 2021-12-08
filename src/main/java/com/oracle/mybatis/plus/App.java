package com.oracle.mybatis.plus;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;
//import com.oracle.mybatis.plus.config.MybatisPlusConfig;
@SpringBootApplication
@MapperScan("com.oracle.mybatis.plus.mapper")
//@Import(MybatisPlusConfig.class)
public class App {

    public static void main(String[] args) {
        SpringApplication.run(App.class,args);
    }
}

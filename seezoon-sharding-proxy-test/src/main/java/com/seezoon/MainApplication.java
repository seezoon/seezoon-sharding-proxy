package com.seezoon;

import com.seezoon.mybatis.repository.mapper.BaseMapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan(basePackages = "com.seezoon.domain.**.mapper", markerInterface = BaseMapper.class)
@SpringBootApplication
public class MainApplication implements CommandLineRunner {


    public static void main(String[] args) {
        SpringApplication.run(MainApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
    }
}

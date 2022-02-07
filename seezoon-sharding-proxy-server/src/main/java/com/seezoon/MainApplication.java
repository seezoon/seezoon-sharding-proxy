package com.seezoon;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MainApplication implements CommandLineRunner {

    @Value("${proxy.port:3307}")
    private String port;

    @Value("${proxy.conf.dir:./conf}")
    private String confDir;

    public static void main(String[] args) {
        SpringApplication.run(MainApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        org.apache.shardingsphere.proxy.Bootstrap.main(new String[]{port, confDir});
    }
}

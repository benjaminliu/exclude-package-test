package com.ben.excludepackagetest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"${packages}"})
public class ExcludePackageTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(ExcludePackageTestApplication.class, args);
    }
}

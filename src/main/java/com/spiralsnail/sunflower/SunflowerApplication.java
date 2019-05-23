package com.spiralsnail.sunflower;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication(scanBasePackages="com.spiralsnail.sunflower")
public class SunflowerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SunflowerApplication.class, args);
    }

}

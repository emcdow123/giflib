package com.teamtreehouse.giflib;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

/**
 * Created by eric.mcdowell on 3/8/17.
 */

@EnableAutoConfiguration
public class AppConfig {
    public static void main(String[] args){
        SpringApplication.run(AppConfig.class, args);
    }
}

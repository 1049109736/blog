package com.nba.blog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

import javax.swing.*;

@SpringBootApplication
public class BlogApplication  {

//    @Overrideextends SpringBootServletInitializer
//    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder){
//        return super.configure(builder);
//    }
    public static void main(String[] args) {
        SpringApplication.run(BlogApplication.class, args);
    }

}



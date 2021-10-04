package com.gory.searchcenter;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan({"com.gory.searchcenter.mapper"})
public class SearchCenterApplication {

    public static void main(String[] args) {
        SpringApplication.run(SearchCenterApplication.class, args);
    }

}

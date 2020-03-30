package com.gx.fm;

import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@Slf4j
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
@MapperScan({"com.gx.fm.mapper"})
public class MultipleDatasourcesApplication {

    public static void main(String[] args) {

        log.info("启动项目");

        SpringApplication.run(MultipleDatasourcesApplication.class, args);
    }

}

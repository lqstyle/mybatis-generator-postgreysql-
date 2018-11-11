package com.kpmg.bmwsfm;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.kpmg.bmwsfm.dao")
public class MybatisGeneratorApplication {

  public static void main(String[] args) {
    SpringApplication.run(MybatisGeneratorApplication.class, args);
  }
}

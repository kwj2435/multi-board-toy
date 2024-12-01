package com.uijin.mboard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class MultiBoardToyApplication {

  public static void main(String[] args) {
    SpringApplication.run(MultiBoardToyApplication.class, args);
  }

}

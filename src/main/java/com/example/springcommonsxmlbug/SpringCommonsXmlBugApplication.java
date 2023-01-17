package com.example.springcommonsxmlbug;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties
@ImportResource("classpath:beans.xml")
public class SpringCommonsXmlBugApplication {

  public static void main(String[] args) {
    SpringApplication.run(SpringCommonsXmlBugApplication.class, args);
  }

}

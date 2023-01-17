package com.example.springcommonsxmlbug.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "example")
public class BeanConfiguration {

  private Integer someProperty;

  @Bean
  public DataSource dataSource() throws InstantiationException {
    if (someProperty == null) {
      throw new InstantiationException("Could not initialize dataSource with someProperty!");
    }

    System.out.println("someProperty: " + someProperty);
    return new DataSource(someProperty);
  }

  public void setSomeProperty(Integer someProperty) {
    this.someProperty = someProperty;
  }
}

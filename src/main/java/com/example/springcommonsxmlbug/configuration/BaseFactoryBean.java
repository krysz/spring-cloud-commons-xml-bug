package com.example.springcommonsxmlbug.configuration;

import org.springframework.beans.factory.FactoryBean;

public class BaseFactoryBean implements FactoryBean<Object> {

  private DataSource dataSource;

  public void setDataSource(DataSource dataSource) {
    this.dataSource = dataSource;
  }

  @Override
  public Object getObject() throws Exception {
    return null;
  }

  @Override
  public Class<?> getObjectType() {
    return null;
  }
}

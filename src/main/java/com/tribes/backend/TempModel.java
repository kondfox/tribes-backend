package com.tribes.backend;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class TempModel {

  private long id;
  private String name;

  public TempModel() {
    this.name = System.getenv().get("VALAMI");
    this.id = (long) (Math.random() * 1000000);
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}

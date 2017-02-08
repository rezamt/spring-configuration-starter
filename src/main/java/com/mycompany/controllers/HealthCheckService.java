package com.mycompany.controllers;

/**
 * Created by reza on 2/8/17.
 */

public class HealthCheckService {

  String name;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String healthCheck() {
    return "{\"" +
            "status\":\"UP\"," +
            "\"service\":\"" + name + "\"" +
            "}";
  }


}

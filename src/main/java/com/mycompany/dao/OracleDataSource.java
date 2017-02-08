package com.mycompany.dao;

/**
 * Created by reza on 2/9/17.
 */
public class OracleDataSource {
  String URL;
  String user;
  String password;
  String connectionCachingEnabled;

  public OracleDataSource() {
  }

  public String getURL() {
    return URL;
  }

  public void setURL(String URL) {
    this.URL = URL;
  }

  public String getUser() {
    return user;
  }

  public void setUser(String user) {
    this.user = user;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public String getConnectionCachingEnabled() {
    return connectionCachingEnabled;
  }

  public void setConnectionCachingEnabled(String connectionCachingEnabled) {
    this.connectionCachingEnabled = connectionCachingEnabled;
  }

  public int close() {
    System.out.println("Connection Closed.");
    return 0;
  }
}

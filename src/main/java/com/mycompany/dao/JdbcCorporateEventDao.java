package com.mycompany.dao;

/**
 * Created by reza on 2/9/17.
 */
public class JdbcCorporateEventDao {
  OracleDataSource dataSource;

  public OracleDataSource getDataSource() {
    return dataSource;
  }

  public void setDataSource(OracleDataSource dataSource) {
    this.dataSource = dataSource;
  }
}

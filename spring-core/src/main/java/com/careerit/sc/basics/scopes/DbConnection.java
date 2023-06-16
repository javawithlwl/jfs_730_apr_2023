package com.careerit.sc.basics.scopes;

import java.sql.Connection;

public final class DbConnection {
  private static DbConnection obj = null;

  private DbConnection() {
  }

  public static DbConnection getInstance() {
    if (obj == null) {
      synchronized (DbConnection.class) {
        if (obj == null) {
          obj = new DbConnection();
        }
      }
    }
    return obj;
  }


  public Connection getConnection() {
    // Logic to connect with database
    return null;
  }
}

package com.careerit.jfs.cj.jdbc;

import java.sql.*;

public class JdbcClient {

  public static void main(String[] args) {

    Connection con = null;
    Statement st = null;
    ResultSet rs = null;
    try {
      con = DriverManager.getConnection("jdbc:postgresql://dpg-chncg4u4dad1d51vem90-a.oregon-postgres.render.com/jsf_may_2023", "dbuser", "1HnWkrn3bIQUkkSfcnwk7gW8YW3nJIWy");
      st = con.createStatement();
      rs = st.executeQuery("select empno,name,email,salary from emp");
      while (rs.next()) {
        int empno = rs.getInt("empno");
        String name = rs.getString("name");
        String email = rs.getString("email");
        double salary = rs.getDouble("salary");
        System.out.println(empno + " " + name + " " + email + " " + salary);
      }
    }catch (SQLException e){
      e.printStackTrace();
    }finally {
      try {
        if (rs != null) {
          rs.close();
        }
        if (st != null) {
          st.close();
        }
        if (con != null) {
          con.close();
        }
      }catch (SQLException e){
        e.printStackTrace();
      }
    }
  }
}

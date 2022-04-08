package com.quintrix.jfs;
 
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
 
public class SelectDataDemo {
  public static void main(String[] args) {
    Connection connection = null;
    Statement insertStmt = null;
    Statement selectStmt = null;
    try
    {
      Class.forName("com.mysql.cj.jdbc.Driver");
      connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql", "root", "dxdydzd7");
       
      /*insertStmt = connection.createStatement();
      insertStmt.execute("INSERT INTO EMPLOYEE (ID,FIRST_NAME,LAST_NAME,STAT_CD) VALUES (1,'Lokesh','Gupta',5)");
      insertStmt.execute("INSERT INTO EMPLOYEE (ID,FIRST_NAME,LAST_NAME,STAT_CD) VALUES (2,'howtodoinjava','com',5)");*/
      
      int empNo = 10020;
      
      selectStmt = connection.createStatement();
      ResultSet rs = selectStmt.executeQuery("select host, user from user");
      ResultSet rs2 = selectStmt.executeQuery("select * from user WHERE Select_priv LIKE 'N'");
      ResultSet rs3 = selectStmt.executeQuery("select user, Update_priv from user");
      
      while(rs.next())
      {
    	System.out.println("|" + rs.getString(1) + "|" + rs.getString(2));
    	System.out.println(rs2);
    	System.out.println(rs3);
        /*System.out.println(rs.getString(1));  //First Column
        System.out.println(rs.getString(2));  //Second Column
        System.out.println(rs.getString(3));  //Third Column
        System.out.println(rs.getString(4));  //Fourth Column*/
      }
    } 
    catch (Exception e) {
      e.printStackTrace();
    }finally {
      try {
        selectStmt.close();
        insertStmt.close();
        connection.close();
      } catch (Exception e) {
        e.printStackTrace();
      }
    }
  }
}
package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.Test;

public class deletedataTest {
  @Test
  public void delete() throws ClassNotFoundException, SQLException {
  
  String dburl="jdbc:mysql://localhost:3306/selenium";
  String username="root";
  String password="nilima";
  Class.forName("com.mysql.jdbc.Driver");
  Connection conn=DriverManager.getConnection(dburl,username,password);
  Statement st=conn.createStatement();
  int delete= st.executeUpdate("delete from employee where id='103'");
  System.out.println("rows are deleted");
  conn.close();
}
}
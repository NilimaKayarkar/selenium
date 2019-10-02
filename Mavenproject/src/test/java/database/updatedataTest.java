package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.Test;

public class updatedataTest {
  @Test
  public void update() throws ClassNotFoundException, SQLException {
	  String dburl="jdbc:mysql://localhost:3306/selenium";
	  String username="root";
	  String password="nilima";
	  Class.forName("com.mysql.jdbc.Driver");
	  Connection conn=DriverManager.getConnection(dburl,username,password);
	  Statement st=conn.createStatement();
	  int update= st.executeUpdate("update employee set name='megha' where id='105'");
	  System.out.println("data is updated in employee");
	  conn.close();
  }
}

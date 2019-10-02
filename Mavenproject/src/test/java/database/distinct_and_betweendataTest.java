package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.Test;

public class distinct_and_betweendataTest {
  @Test
  public void f() throws ClassNotFoundException, SQLException {
	  Class.forName("com.mysql.cj.jdbc.Driver");
	  Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/selenium","root","nilima");
	  Statement st=conn.createStatement();
	 
	  //ResultSet rs=st.executeQuery("select distinct name from student");
	  ResultSet rs=st.executeQuery("select name from employee where salary between 20000 and 40000");
	  while(rs.next()) {
		 String name= rs.getString("name");
		 System.out.println("name is:"+name);
		
	  }
		  conn.close();
		  
  }
}

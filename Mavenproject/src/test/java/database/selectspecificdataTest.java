package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.Test;

public class selectspecificdataTest {
	 String dburl="jdbc:mysql://localhost:3306/selenium";
	  String username="root";
	  String password="nilima";
  @Test
  public void select() throws ClassNotFoundException, SQLException {
	  
	 
	  Class.forName("com.mysql.jdbc.Driver");
	  Connection conn=DriverManager.getConnection(dburl,username,password);
	  Statement st=conn.createStatement();
	  ResultSet rs=st.executeQuery("select employee.name,student.city from employee,student");
	  
	  while(rs.next()) {
		 String  name=rs.getString("name");
		 System.out.println(name);
	  
		   String city=rs.getString("city");
		   System.out.println(city);
	  }
	  
	
	  conn.close();
	  }
  }


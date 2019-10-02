package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.Test;

public class selectdataTest {
  @Test
  public void showdata() throws ClassNotFoundException, SQLException {
	 
	  Class.forName("com.mysql.cj.jdbc.Driver");
	  Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/selenium","root","nilima");
	  Statement st=conn.createStatement();
	 ResultSet rs=st.executeQuery("select * from student");
	  
	  while(rs.next()) {
		 String name= rs.getString("name");
		 System.out.println("name is:"+name);
		 String city=rs.getString("city");
		 System.out.println("city is:"+city);
		 
	  }
		  conn.close();
		  
	  
  }
}

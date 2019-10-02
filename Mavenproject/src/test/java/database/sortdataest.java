package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.Test;

public class sortdataest {
	String dburl="jdbc:mysql://localhost:3306/selenium";
	String username="root";
	String password="nilima";
  @Test
  public void sort() throws ClassNotFoundException, SQLException {
	  Class.forName("com.mysql.jdbc.Driver");
	  Connection conn=DriverManager.getConnection(dburl,username,password);
	  Statement st=conn.createStatement();
	  //ResultSet rs=st.executeQuery("select * from employee order by salary");
	  ResultSet rs=st.executeQuery("select * from employee order by name desc");
	  while(rs.next()) {
		  //int salary=rs.getInt("salary");
		  //System.out.println(salary);
		  String name=rs.getString("name");
		  System.out.println(name);
	  }
	  conn.close();
  }
}

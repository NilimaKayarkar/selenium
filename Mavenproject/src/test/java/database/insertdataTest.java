package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.Test;

public class insertdataTest {
  @Test
  public void insert() throws ClassNotFoundException, SQLException {
	  String dburl="jdbc:mysql://localhost:3306/selenium";
	  String username="root";
	  String password="nilima";
	  Class.forName("com.mysql.jdbc.Driver");
	  Connection conn=DriverManager.getConnection(dburl,username,password);
	  Statement st=conn.createStatement();
	  int update1= st.executeUpdate("insert into student(name,city)values('mayuri','yavatmal')");
	  System.out.println(update1+"row updated in student data");
	  //int update2= st.executeUpdate("insert into student(id,name,salary,dept)values('108','nidhi','50000','marketing')");
	  //System.out.println(update2+"row updated in employee data");
	  conn.close();
			 
  }
}

package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.Test;

public class createtableTest {
	String dburl="jdbc:mysql://localhost:3306/selenium";
	  String username="root";
	  String password="nilima";
  @Test
  public void create() throws ClassNotFoundException, SQLException {
	  Class.forName("com.mysql.jdbc.Driver");
	  Connection conn=DriverManager.getConnection(dburl,username,password);
	  Statement st=conn.createStatement();
	  int create=st.executeUpdate("create table product (id int(5),name char(20),price int(20))");
	  System.out.println("table is created");
	  int insert1=st.executeUpdate("insert into product(id,name,price)values('10','mobile','15000')");
	  int insert2=st.executeUpdate("insert into product(id,name,price)values('11','pendrive','600')");
	  System.out.println("data inserted");
	  int delete=st.executeUpdate("delete from product where id='10'");
	  System.out.println("data deleted");
	  
	  conn.close();
  }
  
}

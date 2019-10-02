package datadriven_concept;

import org.testng.annotations.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;

public class DatabaseTest {
	WebDriver driver;
	String dburl="jdbc:mysql://localhost:3306/selenium";
	String username="root";
	String password="nilima";
	
  @BeforeTest
  public void f() {
	  System.setProperty("webdriver.chrome.driver","D:\\selenium software\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
	 
  }
  @Test
  public void beforeTest() throws ClassNotFoundException, SQLException, InterruptedException {
	  Class.forName("com.mysql.jdbc.Driver");
	  Connection conn=DriverManager.getConnection(dburl,username,password);
	  Statement st=conn.createStatement();
	  ResultSet rs=st.executeQuery("select * from orangehrm");
	  while(rs.next()) {
	  driver.findElement(By.name("txtUsername")).sendKeys(rs.getString("username"));
	  
	    driver.findElement(By.id("txtPassword")).sendKeys(rs.getString("password"));
	
		driver.findElement(By.className("button")).click();
		if(driver.getCurrentUrl().equalsIgnoreCase("https://opensource-demo.orangehrmlive.com/index.php/dashboard")) {
			WebDriverWait wait=new WebDriverWait(driver, 30);
    		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#welcome"))).click();
    		Thread.sleep(2000);
	   	  	  driver.findElement(By.linkText("Logout")).click();
	   	   Thread.sleep(2000);
		}
		driver.navigate().back();
		driver.findElement(By.name("txtUsername")).clear();
		driver.findElement(By.id("txtPassword")).clear();
		
  }
	  conn.close();
}
}
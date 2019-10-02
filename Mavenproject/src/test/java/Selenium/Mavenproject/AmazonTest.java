package Selenium.Mavenproject;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class AmazonTest 
{
	WebDriver driver;
	
	
  @Test
  public void f() {
	  driver.findElement(By.xpath("//span[contains(text(),'Hello, Sign in')]")).click();
	  driver.findElement(By.xpath("//a[@id='createAccountSubmit']")).click();
	  driver.findElement(By.xpath("//input[@id='ap_customer_name']")).sendKeys("mayuri");
	  driver.findElement(By.name("email")).sendKeys("mkaw1234@gmail.com");
	  driver.findElement(By.xpath("//input[@id='ap_password']")).sendKeys("abcd1234");
	  driver.findElement(By.xpath("//input[@id='ap_password_check']")).sendKeys("abcd1234");
	  driver.findElement(By.xpath("//input[@id='continue']")).click();
		 
		 
  }
  @BeforeTest
  public void broser() {
	  System.setProperty("webdriver.chrome.driver","D:\\selenium software\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("http://amezon.com");
	
  }

  @AfterTest
  public void afterTest() {
  }

}

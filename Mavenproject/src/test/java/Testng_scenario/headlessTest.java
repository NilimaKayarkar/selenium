package Testng_scenario;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;

public class headlessTest {
	WebDriver driver;
	
  @Test
  public void f() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver","D:\\selenium software\\chromedriver.exe");
	  ChromeOptions options=new ChromeOptions();
	  options.addArguments("1000,720");
	  options.addArguments("headless");
	  driver=new ChromeDriver(options);
	  driver.navigate().to("http://www.fb.com");
	  Thread.sleep(2000);
	  String str=driver.getTitle();
	  System.out.println(str);
  }
  @BeforeTest
  public void browser() {
	  
	 
	  
	  
  }

 
}

package Testng_scenario;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class gmailcreationTest {
	WebDriver driver;
  @Test
  public void account() throws Exception {
	 
	 driver.findElement(By.xpath("//span[@class='NlWrkb snByac']")).click();
	  
  }
  @BeforeTest
  public void browser() {
	  System.setProperty("webdriver.chrome.driver", "D:\\selenium software\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("https://www.gmail.com");
	  driver.manage().window().maximize();
  }

}

package Testng_scenario;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;

public class hoveringTest {
	WebDriver driver;
	
  @Test
  public void spicejethovering() throws InterruptedException {
	 Actions a=new Actions(driver);
	 a.moveToElement(driver.findElement(By.linkText("LOGIN / SIGNUP"))).build().perform();
	 Thread.sleep(2000);
	 driver.findElement(By.linkText("GST Invoice")).click();
	  
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver","D:\\selenium software\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("https://www.spicejet.com");
  }

  @AfterTest
  public void afterTest() {
  }

}

package Testng_scenario;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.io.IOException;
import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;

public class fileuploadTest {
	WebDriver driver;
  @Test
  public void upload() throws IOException, InterruptedException {
	  
	  driver.findElement(By.xpath("//span[contains(text(),'Upload Files')]")).click();
	  
	  Thread.sleep(2000);
	 Runtime.getRuntime().exec("D:\\selenium software\\Mavenproject\\filebrowser.exe");
	 Actions a=new Actions(driver);
	 a.keyDown(Keys.CONTROL).sendKeys(Keys.END).build().perform();//for scroll down
	  
  }
  @BeforeTest
  public void browser() {
	  System.setProperty("webdriver.chrome.driver", "D:\\selenium software\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("https://pdf2doc.com/");
	  
  }

 

}

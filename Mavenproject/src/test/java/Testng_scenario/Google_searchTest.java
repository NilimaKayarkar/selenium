package Testng_scenario;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Google_searchTest {
	WebDriver driver;
  @Test
  public void f() {
	  System.setProperty("webdriver.chrome.driver","D:\\selenium software\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("java");//enter in searchbox
		
  }
}

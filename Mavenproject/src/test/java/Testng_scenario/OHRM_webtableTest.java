package Testng_scenario;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class OHRM_webtableTest {
	WebDriver driver;
  @Test
  public void f() {
	  System.setProperty("webdriver.chrome.driver","D:\\selenium software\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//span[@class='form-hint'][contains(text(),'Username')]")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
		
		driver.findElement(By.xpath("//b[contains(text(),'Admin')]")).click();
		
		
  }
}

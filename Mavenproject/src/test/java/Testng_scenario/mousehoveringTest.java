package Testng_scenario;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class mousehoveringTest {
	WebDriver driver;
	
  @Test
  public void amezone() {
	  System.setProperty("webdriver.chrome.driver", "D:\\selenium software\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("https://www.amazon.com");
	  driver.manage().window().maximize();
	  Actions a=new Actions(driver);
	  a.moveToElement(driver.findElement(By.xpath("//span[contains(text(),'Hello, Sign in')]"))).build().perform();//mouse hovering on account and list
	  driver.findElement(By.xpath("//span[contains(text(),'Create a List')]")).click();//click on create list
	  driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("samsung galaxy s10 plus");//give input in search box
	  driver.findElement(By.className("nav-input")).click();//click on search button
	  driver.navigate().back();//back to previous page
	  driver.navigate().back();//back to previous page
	  driver.navigate().forward();//back to next page
	  driver.navigate().refresh();//refresh the page
  }
}

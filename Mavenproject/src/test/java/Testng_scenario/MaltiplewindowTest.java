package Testng_scenario;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MaltiplewindowTest {
	WebDriver driver;
  @Test
  public void Window() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver", "D:\\selenium software\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("http://demo.automationtesting.in/Windows.html");
	  driver.manage().window().maximize();
	  driver.findElement(By.xpath("//a[contains(text(),'Open New Tabbed Windows')]")).click();
	  driver.findElement(By.xpath("//div[@id='Tabbed']//button[@class='btn btn-info'][contains(text(),'click')]")).click();
	  System.out.println(driver.getTitle());
	  Set<String> s=driver.getWindowHandles();//capture id of all windows
	  
	  for(String i:s) {
		  String t=driver.switchTo().window(i).getTitle();
		  System.out.println(t);
		  System.out.println(i);
		  if(t.contains("Sakinalium | Home")) {
			  driver.findElement(By.xpath("//ul[@class='nav navbar-nav navbar-right']//a[contains(text(),'Download')]")).click();
			  Thread.sleep(2000);
			  driver.close();
		  }
			 
	  }
  }
  
}

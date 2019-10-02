package selenium_grid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class GridtwonodeTest {
	WebDriver driver;
	String baseurl="https://www.fb.com";
	String nodeurl1="http://192.168.100.17:6666/wd/hub";
	String nodeurl2="http://192.168.100.17:7777/wd/hub";
	
	public void url_insertion() {
		driver.get(baseurl);
	}
	public void login() {
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("nilila@gmail.com");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("nilima123");
		driver.findElement(By.xpath("//input[@id='u_0_b' or @value=\"Log In\"]")).click();
	}
  @Test(priority = 1)
  public void chrome() {
	  DesiredCapabilities capability=DesiredCapabilities.chrome();
	  capability.setBrowserName("chrome");
	  capability.setPlatform(Platform.WINDOWS);
	  try {
		driver= new RemoteWebDriver(new URL(nodeurl1),capability);
	} catch (MalformedURLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	  url_insertion();
	  login();
	  
  }
  @Test(priority = 2)
  public void firefox() {
	  DesiredCapabilities capability=DesiredCapabilities.firefox();
	  capability.setBrowserName("firefox");
	  capability.setPlatform(Platform.WINDOWS);
	  try {
		driver=new RemoteWebDriver(new URL(nodeurl2),capability);
	} catch (MalformedURLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	  url_insertion();
	  login();
	  
  }
}

package Testng_scenario;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

public class Fb_screenshotTest {
	WebDriver driver;
  @Test
  public void screenshot() throws IOException 
  {
	  System.setProperty("webdriver.chrome.driver", "D:\\selenium software\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("https://fb.com");
	  driver.manage().window().maximize();
	  File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	  FileHandler.copy(f, new File("D:\\selenium software\\Mavenproject\\screenshot\\fb.jpg"));
  }
}

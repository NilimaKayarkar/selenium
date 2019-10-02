package Testng_scenario;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

public class headlessscreenshotTest {
	WebDriver driver;
  @Test
  public void screenshot() throws IOException
{
	 System.setProperty("webdriver.chrome.driver", "D:\\selenium software\\chromedriver.exe");
	 ChromeOptions options=new ChromeOptions();
	 options.addArguments("headless");
	 driver=new ChromeDriver(options);
	 driver.get("https:\\gmail.com");
	 String str=driver.getTitle();
	 System.out.println(str);
	 File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	 FileHandler.copy(f, new File("D:\\selenium software\\Mavenproject\\screenshot\\gmail.jpg"));
	
  }
}

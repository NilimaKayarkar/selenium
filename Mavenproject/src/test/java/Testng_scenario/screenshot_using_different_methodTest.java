package Testng_scenario;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

public class screenshot_using_different_methodTest {
	WebDriver driver;
	public void screenshot(String str) throws IOException {
		File f= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(f,new File("D:\\selenium software\\Mavenproject\\screenshot\\"+str+".jpg"));
	}
	
  @Test(priority = 0)
  public void signin() throws IOException {
	  System.setProperty("webdriver.chrome.driver","D:\\selenium software\\chromedriver.exe");
		 driver=new ChromeDriver();
		 driver.get("https://www.fb.com");
		 driver.manage().window().maximize();
		 screenshot("fbhomepage");
		 
  }
  @Test(priority = 1)
  public void login() throws IOException {
	  screenshot("fbloginpage");
  }
}

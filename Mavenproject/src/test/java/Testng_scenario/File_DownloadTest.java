package Testng_scenario;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class File_DownloadTest {
	WebDriver driver;
  @Test
  public void f() {
	  System.setProperty("webdriver.chrome.driver","D:\\selenium software\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://demo.automationtesting.in/FileDownload.html");
		driver.manage().window().maximize();
		
		driver.findElement(By.className("form-control")).sendKeys("Welcome in selenium");
		driver.findElement(By.className("btn btn-default")).click();
		driver.findElement(By.linkText("Download")).click();
  }
}

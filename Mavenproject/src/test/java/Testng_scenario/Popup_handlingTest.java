package Testng_scenario;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Popup_handlingTest {
	WebDriver driver;
  @Test
  public void hdfc() {
	  System.setProperty("webdriver.chrome.driver","D:\\selenium software\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.hdfcbank.com/");
		driver.manage().window().maximize();
		
		
		String homepage=driver.getWindowHandle();
		System.out.println(homepage);
		
		driver.findElement(By.xpath("//a[@id='loginsubmit']")).click();
		String popup_page=driver.getWindowHandle();
		System.out.println(popup_page);
		
		Set<String> windows=driver.getWindowHandles();
		System.out.println(windows.size());
  }
}

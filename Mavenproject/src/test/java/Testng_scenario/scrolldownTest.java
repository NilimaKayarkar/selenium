package Testng_scenario;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class scrolldownTest {
	WebDriver driver;
  @Test
  public void action() throws Exception {
	  System.setProperty("webdriver.chrome.driver", "D:\\selenium software\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("https://www.amazon.com");
	  driver.manage().window().maximize();
	  Actions a=new Actions(driver);
	  a.keyDown(Keys.CONTROL).sendKeys(Keys.END).build().perform();//for scroll down up to end
	 // Thread.sleep(2000);
	//  a.keyUp(Keys.CONTROL).sendKeys(Keys.ARROW_UP).build().perform();//
  }
}

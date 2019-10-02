package datadriven_concept;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class DataproviderTest {
	WebDriver driver;
  @Test(dataProvider = "authentication")
  public void f(String username, String password) {
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

      driver.findElement(By.id("email")).clear();
      driver.findElement(By.id("email")).sendKeys(username);
      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
      driver.findElement(By.id("pass")).clear();
      driver.findElement(By.id("pass")).sendKeys(password);
		
  }

  @DataProvider(name="authentication")
  public static Object[][] credential() {
    return new Object[][] {
       { "nilima@gmail.com", "vhhgfh123" },
       { "mayuri@gmail.com", "ngfh@355" },
       {"ravi@gmail.com","gfgf45"}
      
    };
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver","D:\\selenium software\\chromedriver.exe");
		 driver=new ChromeDriver();
		 driver.get("https://www.facebook.com");
  }

}

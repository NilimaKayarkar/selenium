package password;

import org.apache.commons.codec.binary.Base64;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PasswordTest {
	WebDriver driver;
  @Test
  public void f() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver","D:\\selenium software\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.name("txtUsername")).sendKeys("Admin");
		Thread.sleep(2000);
		driver.findElement(By.id("txtPassword")).sendKeys(decode("YWRtaW4xMjM="));
		driver.findElement(By.className("button")).click();
  }
  static String decode(String password) {
	  byte[] decodestring = Base64.decodeBase64(password);
	  String decode = null;
	return(new String(decodestring));
  }
}

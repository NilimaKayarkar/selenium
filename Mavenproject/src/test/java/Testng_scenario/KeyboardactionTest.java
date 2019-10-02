package Testng_scenario;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class KeyboardactionTest {
	 WebDriver driver;
  @Test
  public void keyboard() {
	  System.setProperty("webdriver.chrome.driver","D:\\selenium software\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.fb.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("adfgh");
		Actions a=new Actions(driver);
		a.sendKeys(Keys.TAB).build().perform();//used for tab
		driver.findElement(By.xpath("//input[@id='pass' ]")).sendKeys("dfhg34");//supply value in password field
		//a.sendKeys("df234").build().perform();//supply value in password field
		a.sendKeys(Keys.RETURN).build().perform();//used for enter
		driver.navigate().to("http://www.google.com");
		a.sendKeys("apple").build().perform();
		a.sendKeys(Keys.RETURN).build().perform();
		
  }
}

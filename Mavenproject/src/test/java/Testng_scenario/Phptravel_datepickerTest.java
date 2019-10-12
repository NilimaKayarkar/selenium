package Testng_scenario;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Phptravel_datepickerTest {
	WebDriver driver;
	String month="December 2019";
	String date="25";
  @Test
  public void f() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver","D:\\selenium software\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.phptravels.net/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//div[@id='dpd1']//input[@placeholder='Check in']")).click();//click on check in
		Thread.sleep(2000);
		while(true) {
			String text=driver.findElement(By.xpath("//div[14]//div[1]//tr[1]//th[2]")).getText();//current month inspect code
			if(text.equals(month)) {
				break;
			}
			else {
				driver.findElement(By.xpath("//div[14]//div[1]//tr[1]//th[3]")).click();//click on >
				
			}
		}
		
  driver.findElement(By.xpath("/html[1]/body[1]/div[14]/div[1]/table[1]/tbody[1]/tr/td[contains(text(),"+date+")]")).click();//focus on webtable.This is customize xpath
  }
}

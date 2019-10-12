package Testng_scenario;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Spicejet_datepickerTest {
	WebDriver driver;
	String month="October2019";
	String date="20";
	
  @Test
  public void f() {
	  System.setProperty("webdriver.chrome.driver","D:\\selenium software\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_view_date1']")).click();
		
		while(true) {
		String text=driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]")).getText();//click on current month
		if(text.equals(month)) {
			break;
		}
		else {
			driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
		}
  }
		List<WebElement> alldate=driver.findElements(By.xpath("/html[1]/body[1]/div[2]/div[1]/table[1]/tbody[1]/tr/td/a[1]"));
		for(WebElement ele:alldate) {
			String date_text=ele.getText();
			if(date_text.equals(date)) {
				ele.click();
				break;
			}
			
		}
  }
}

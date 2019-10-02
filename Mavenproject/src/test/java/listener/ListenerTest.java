package listener;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ListenerTest {
	WebDriver driver;
  @Test(priority = 0)
  public void browser() {
	  System.setProperty("webdriver.chrome.driver","D:\\selenium software\\chromedriver.exe");
		 driver=new ChromeDriver();
		 driver.get("https://www.amazon.com");
		 driver.manage().window().maximize(); 
  }
  @Test(priority = 1)
  public void search() throws InterruptedException {
	 
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("dell laptop");//type in search box
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//div[@class='nav-search-submit nav-sprite']//input[@class='nav-input']")).click();//click on search
	  driver.findElement(By.xpath("//div[@class='block sky desktopSparkle__contentContainer']//div[1]//div[1]//div[1]//a[1]//div[1]//div[1]//img[1]")).click();//click on image
  }
  
  @Test(priority = 2)
  public void review() throws InterruptedException {
	  driver.findElement(By.xpath("//div[@id='averageCustomerReviews_feature_div']//span[@id='acrCustomerReviewText']")).click();//click on review
	  driver.findElement(By.xpath("//span[@id='cr-lighthouse-term-battery_life']")).click();//click on battery review
	  Thread.sleep(2000);
  }
  @Test(priority = 3)
  public void closed() {
	  driver.close();
  }
  
}

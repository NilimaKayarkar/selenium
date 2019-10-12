package Testng_scenario;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BrokenlinkTest {
	WebDriver driver;
  @Test
  public void f() throws IOException {
	  System.setProperty("webdriver.chrome.driver","D:\\selenium software\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");
		driver.manage().window().maximize();
		
		List<WebElement> links=driver.findElements(By.tagName("a")); //capture all link from page
		System.out.println(links.size()); //print no. of link
		for(int i=0;i<links.size();i++) {
			WebElement ele=links.get(i);
			//by using href attribute we can get url of required link
			String url=ele.getAttribute("href");
			URL link=new URL(url);
			HttpURLConnection conn=(HttpURLConnection) link.openConnection(); //create connection using url object link
			conn.connect();
			int rescode=conn.getResponseCode();// return respond code. if rescode is above 400:broken link
			if(rescode>=400) {
				System.out.println(url + "-"+"is broken link");
			}
			else {
				System.out.println(url + "-" + "is valid link");
			}
			
	}
		
  }
}

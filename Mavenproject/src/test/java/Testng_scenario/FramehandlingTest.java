package Testng_scenario;







import java.util.List;

import javax.sound.sampled.LineListener;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import net.bytebuddy.asm.Advice.Return;

public class FramehandlingTest {
	WebDriver driver;
  @Test
  public void frame() throws Exception {
	  System.setProperty("webdriver.chrome.driver","D:\\selenium software\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("C:\\Users\\Dell\\Desktop\\frames.html");
	  driver.manage().window().maximize();
	 // driver.switchTo().frame("mindq");//using frame name
      //Thread.sleep(2000);
	 // driver.findElement(By.linkText("Hyderabad")).click();
	  driver.switchTo().frame(2);
	  Thread.sleep(2000);
	  driver.findElement(By.linkText("IDEA")).click();
	  
	  List<WebElement>iframElements=driver.findElements(By.tagName("iframe"));
	  System.out.println("no. of frame is"+iframElements.size());
	  
	  
	  
  }
}

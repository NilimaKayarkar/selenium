package selenium_grid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class GridexampleTest {
	WebDriver driver;
	String huburl,nodeurl;
  @Test
  public void grid() {
	  huburl="https://www.fb.com";
	  nodeurl="http://192.168.100.17:6666/wd/hub";
	  
	  DesiredCapabilities capability=DesiredCapabilities.chrome();
	  capability.setBrowserName("chrome");
	  capability.setPlatform(Platform.WINDOWS);
	  
	  try {
		driver=new RemoteWebDriver(new URL(nodeurl),capability);
	} catch (MalformedURLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	  driver.get(huburl);
  }
  
}

package Selenium.Mavenproject;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

public class GroupingTest {
  @Test(groups = "icecream",priority=1)
  public void vanilla() 
  {
	 System.out.println("this is vanilla method"); 
  }
  @Test(groups = "icecream",priority=2)
  public void butterscotch() 
  {
	  System.out.println("this is butterscotch");
  }
  @Test(groups = "icecream",priority=3)
  public void strawbery() 
  {
	  System.out.println("this is strawbery");
  }
  @Test(groups = "icecream",priority=4)
  public void orange()
  {
	  System.out.println("this is orange");
  }

}

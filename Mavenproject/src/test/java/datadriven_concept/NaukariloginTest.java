package datadriven_concept;

import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class NaukariloginTest {
	WebDriver driver;
  @Test
  public void data() throws IOException, InterruptedException {
	  FileInputStream fis=new FileInputStream("D:\\selenium software\\Mavenproject\\testdata\\NAUKRI LOGIN TEST DATA.xlsx");
	  XSSFWorkbook workbook=new XSSFWorkbook(fis);
	  XSSFSheet sheet=workbook.getSheet("logindata");
	  for(int i=0;i<=sheet.getLastRowNum();i++) {
		driver.findElement(By.xpath("//div[contains(text(),'Login')]")).click();
		driver.findElement(By.xpath("//input[@id='eLoginNew']")).sendKeys(sheet.getRow(i).getCell(0).toString());
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='pLogin']")).sendKeys(sheet.getRow(i).getCell(1).toString());
		driver.findElement(By.xpath("//button[contains(text(),'Login')]")).click();
		Thread.sleep(2000);
		driver.navigate().to("http://www.naukri.com");
	  }
	 }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver","D:\\selenium software\\chromedriver.exe");
		 driver=new ChromeDriver();
		 driver.get("https://www.naukri.com/");
  }

}

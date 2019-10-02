package datadriven_concept;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class Read_excel1Test {
  @Test
  public void data() throws IOException {
	  FileInputStream fis=new FileInputStream("D:\\selenium software\\Mavenproject\\testdata\\ReadExcelData.xlsx");
	  XSSFWorkbook workbook=new XSSFWorkbook(fis);    //using sheetname
	 // XSSFSheet sheet=workbook.getSheet("test");   //using sheetindex
	  XSSFSheet sheet=workbook.getSheetAt(0);
	  for(int i=0;i<=sheet.getLastRowNum();i++) {
		  System.out.println(sheet.getRow(i).getCell(0).toString());
	  }
		  
	
	  
  }
}

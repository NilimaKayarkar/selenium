package datadriven_concept;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.swing.filechooser.FileNameExtensionFilter;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;



public class Readexcel_switchcaseTest {
  @Test
  public void read() throws IOException {
	  String filepath = System.getProperty("user.dir")+"\\testdata\\OrangeHRM_TestCases.xlsx";
	  String sheetname="hrm";
	  File f=new File(filepath);
	  FileInputStream is=new FileInputStream(f);
	  
	  Workbook wb=null;
	  Sheet sh=null;
	  Row row=null;
	  Cell cell=null;
	  
	  if(filepath.endsWith(".xls")) 
		  wb=new HSSFWorkbook(is);
	  else if(filepath.endsWith(".xlsx"))
		  wb=new XSSFWorkbook(is);
	  
	  sh=wb.getSheet("hrm");
	  int nr=sh.getLastRowNum();
	  for(int i=1;i<=nr;i++) {
		  cell=sh.getRow(i).getCell(3);
		  switch (cell.getCellType()) {
		  case NUMERIC:
			  System.out.println(cell.getNumericCellValue());
			  break;
		case STRING:
			System.out.println(cell.getStringCellValue());
			break;
		case BOOLEAN:
			System.out.println(cell.getBooleanCellValue());
			break;
			default:
				System.out.println("unknown");
			
			break;

		
		}
	  }
	  
  }
}

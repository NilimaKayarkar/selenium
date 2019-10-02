package datadriven_concept;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;



public class createexcelTest {
  

@Test
  public void create() throws IOException {
	  String filepath=System.getProperty("user.dir")+"\\testdata\\newexcel.xlsx";    //user.dir reffer to current project means maven project
	  File f=new File(filepath);
	  Workbook wb=null;
	  Sheet sh=null;
	  Row row=null;
	  Cell cell=null;
	  
	   if(filepath.endsWith(".xls")) 
		   wb=new HSSFWorkbook();
	   else if(filepath.endsWith(".xlsx")) 
		   wb=new XSSFWorkbook();
	   
	   sh=wb.createSheet("data1");
	   for(int i=0;i<10;i++) {
		   row=sh.createRow(i);
		   for(int j=0;j<10;j++){
		   cell=row.createCell(j);
		   cell.setCellValue("test"+i+j);
		   
		 }
		    }
	   FileOutputStream fos = null;
	try {
		fos = new FileOutputStream(f);
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	   wb.write(fos);
	   wb.close();
}
}


//To see whether file is created or not check in testdata folder if file is not see in the folder, then refresh folder by right clicking on folder.

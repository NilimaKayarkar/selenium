package datadriven_concept;

import java.io.File;
import java.io.FileInputStream;
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

public class Write_in_existing_exceltest {
  @Test
  public void f() throws IOException {
	  String filepath = System.getProperty("user.dir")+"\\testdata\\OrangeHRM_TestCases.xlsx";
		String sheetname = "hrm";
		File f=new File(filepath);
		FileInputStream is=new FileInputStream(f);
		
		Workbook wb=null;
		Sheet sh=null;
		Row row=null;
		Cell cell=null;
		
		if(filepath.endsWith(".xlsx"))
			wb=new XSSFWorkbook(is);
		else if(filepath.endsWith(".xls"))
			wb=new HSSFWorkbook(is);
		
		sh=wb.getSheet("hrm");
		int nr=sh.getLastRowNum()+1;
		for(int i=1;i<nr;i++) {
			row=sh.getRow(i);
			cell=row.getCell(6);
			if(cell==null)
				cell=row.createCell(6);
			cell.setCellValue("pass");
		
 }
		FileOutputStream os=new FileOutputStream(f);
				wb.write(os);
		wb.close();
}}

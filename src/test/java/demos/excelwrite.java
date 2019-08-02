package demos;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class excelwrite {

	
	
	@Test
	public void readData() throws IOException {
		File src = new File("C:\\Users\\training_c2d.02.11\\kavya\\Book1.xlsx");
		
		FileInputStream fis = new FileInputStream(src);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet1 = wb.getSheetAt(0);
		sheet1.getRow(0).createCell(1).setCellValue("pass");
		sheet1.getRow(1).createCell(2).setCellValue("pass");
		
		FileOutputStream fo = new FileOutputStream(src);
		
		wb.write(fo);
		wb.close();
	}
	
}

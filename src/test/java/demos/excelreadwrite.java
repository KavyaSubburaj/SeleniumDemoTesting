package demos;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class excelreadwrite {
	
	WebDriver driver;
	
	@Test
	public void readData() throws IOException {
		File src = new File("C:\\Users\\training_c2d.02.11\\kavya\\Book1.xlsx");
		
		FileInputStream fis = new FileInputStream(src);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet1 = wb.getSheetAt(0);
		
		
		
		
		int rowCount = 3;
		int cellColumn=3;
		
		/*String data0 = sheet1.getRow(0).getCell(0).getStringCellValue();
		System.out.println("---------------->Data from Excel: "+ data0);
		
		 driver.findElement(By.name("userName")).sendKeys(data0);
		
		String data1 = sheet1.getRow(0).getCell(1).getStringCellValue();
		System.out.println("---------------->Data from Excel: "+ data1);
		
		 driver.findElement(By.name("password")).sendKeys(data1);
		
		
		 driver.findElement(By.name("login")).click();
		 */
		
		
		 for(int i=0; i<rowCount; i++) {
		  for(int j=0; j<cellColumn; j++){
		  
			 
			 String data01 = sheet1.getRow(i).getCell(j).getStringCellValue();
				System.out.println("---------------->Data from Excel: "+ data01);
				
				 driver.findElement(By.name("userName")).sendKeys(data01);
				 
		  }	 
		 }
		 
		 
		wb.close();
		
		}
	
	
	@BeforeTest
	  public void beforeClass() {
		  System.setProperty("webdriver.chrome.driver", "C:\\Selenium 3.0\\Selium 3.0\\Selium 3.0\\chromedriver.exe");
		  driver = new ChromeDriver();
		 
		  //driver.get("http://10.232.237.143:443/TestMeApp/");
		 driver.get("http://demoaut.com/");
		 
	  }
}

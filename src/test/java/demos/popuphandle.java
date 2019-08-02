package demos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class popuphandle {
	
	WebDriver driver;
	
	public void f() {
		 System.setProperty("webdriver.chrome.driver","C://Users//training_c2d.02.11//Desktop//Webdriver//chromedriver.exe");
		  driver =new ChromeDriver();
		  driver.get("http://10.232.237.143:443/TestMeApp/");
		  driver.findElement(By.xpath("//form[@method='post']/input")).click();
		  String alertMessage = driver.switchTo().alert().getText();
		  driver.switchTo().alert().accept();
		  System.out.println(alertMessage);
		  driver.close();
	}

}

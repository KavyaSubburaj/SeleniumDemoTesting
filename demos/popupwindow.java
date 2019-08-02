package demos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class popupwindow {
	
	WebDriver driver;
	
  @Test
  public void f() {
	  
	  System.setProperty("webdriver.chrome.driver","C://Users//training_c2d.02.11//Desktop//Webdriver//chromedriver.exe");
	  driver =new ChromeDriver();
	  driver.get("http://10.232.237.143:443/TestMeApp/");
	  
	  set<String> set=driver.getWindowHandles();
	  for(String s:set) {
		  driver.switchTo().window(s);
		}
	  driver.switchTo().frame(driver.findElement(By.name("main_page")));
	 // driver.switchTo().frame("main_page");
	  String address=driver.findElement(By.tagName("address")).getText();
	  System.out.println(address);
	//  driver.switchTo().window("parentwindow");
	  driver.quit();
  }
}

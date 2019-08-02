package demos;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class popupwindow {
  
	WebDriver driver;
	
	@Test
    public void f() {
	  
	  System.setProperty("webdriver.chrome.driver","C://Users//training_c2d.02.11//Desktop//Webdriver//chromedriver.exe");
	  driver =new ChromeDriver();
	  driver.get("http://10.232.237.143:443/TestMeApp/");
	  
	    WebElement aboutus= driver.findElement(By.xpath("//ul/li[@class='topmenu']/a/span[text()='AboutUs']"));
		WebElement ouroffice= driver.findElement(By.xpath("//ul/li[@class='subfirst']"));
		WebElement chennai= driver.findElement(By.xpath("//ul/li[@class='sublast']/a/span[text()='Chennai']"));
		
		Actions act = new Actions(driver);
		act.moveToElement(aboutus).click().build().perform();
		
		WebDriverWait wait = new WebDriverWait(driver, 50);
		
		wait.until(ExpectedConditions.elementToBeClickable(ouroffice));
		act.moveToElement(ouroffice).click().build().perform();
		
		wait.until(ExpectedConditions.elementToBeClickable(chennai));
		act.moveToElement(chennai).click().build().perform();
	  
	  
	  Set<String> set=driver.getWindowHandles();
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

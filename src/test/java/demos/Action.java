package demos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Action {

	WebDriver driver;
	
	@Test
	public void action() {
		/*WebElement aboutus= driver.findElement(By.xpath(""));
		WebElement ouroffice= driver.findElement(By.xpath(""));
		WebElement chennai= driver.findElement(By.xpath(""));
		
		Actions act = new Actions(driver);
		act.moveToElement(aboutus).click().build().perform();
		
		WebDriverWait wait = new WebDriverWait(driver, 50);
		
		wait.until(ExpectedConditions.elementToBeClickable(ouroffice));
		act.moveToElement(ouroffice).click().build().perform();
		
		wait.until(ExpectedConditions.elementToBeClickable(chennai));
		act.moveToElement(chennai).click().build().perform();*/
		
		driver.findElement(By.xpath("//form[@method='post']/input")).click();
		WebDriverWait wait = new WebDriverWait(driver,10);  
		String alertMessage = driver.switchTo().alert().getText();
		  driver.switchTo().alert().accept();
		  WebDriverWait wait1 = new WebDriverWait(driver,10); 
		  System.out.println(alertMessage);
		  driver.close();
		
	}
	
	
	
	@BeforeTest
	  public void beforeClass() {
		  System.setProperty("webdriver.chrome.driver", "C:\\Selenium 3.0\\Selium 3.0\\Selium 3.0\\chromedriver.exe");
		  driver = new ChromeDriver();
		 driver.get("http://10.232.237.143:443/TestMeApp/");
		 
	  }
}

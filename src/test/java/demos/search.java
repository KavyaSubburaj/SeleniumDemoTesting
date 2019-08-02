package demos;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class search {
	WebDriver driver;
	
	@Test
	public void searchSync() {
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebElement searcha = driver.findElement(By.id("myInput"));
		searcha.sendKeys("B");
		
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		searcha.sendKeys("a");
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		searcha.sendKeys("g");
		
		
		Actions act1 = new Actions(driver);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//act1.keyDown(searcha, Keys.BACK_SPACE);
		act1.keyDown(searcha,Keys.SHIFT);
		act1.moveToElement(driver.findElement(By.xpath("//div[contains(text(),'Hand bag')]"))).click().build().perform();
		act1.moveToElement(driver.findElement(By.xpath("//input[@type='submit' and @value='FIND DETAILS']"))).click().build().perform();
		
		driver.close();
	}
	
	
	@BeforeTest
	  public void beforeClass() {
		 // System.setProperty("webdriver.chrome.driver", "C:\\Selenium 3.0\\Selium 3.0\\Selium 3.0\\chromedriver.exe");
		  System.setProperty("webdriver.gecko.driver","C:\\Selenium 3.0\\Selium 3.0\\Selium 3.0\\geckodriver.exe");
		 // driver = new ChromeDriver();
		  driver = new FirefoxDriver();
		 driver.get("http://10.232.237.143:443/TestMeApp/");
		 
	  }
}

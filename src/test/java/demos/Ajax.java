package demos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Ajax {

	WebDriver driver;
	
	@Test
	  public void beforeClass() {
		driver.get("http://demos.telerik.com/aspnet-ajax/ajaxloadingpanel/functionality/explicit-show-hide/defaultcs.aspx");
		By container = By.cssSelector(".demo-container");
		WebDriverWait wait = new WebDriverWait(driver, 5);
		
		WebElement noDatesTextElement = driver.findElement(By.xpath("//div[@class='RadAjaxPanel']/span"));
		String textBeforeAjaxCall = noDatesTextElement.getText().trim();
		
		driver.findElement(By.linkText("1")).click();
		
		By loader = By.className("raDiv");
		
		wait.until(ExpectedConditions.invisibilityOfElementLocated(loader));
		
		WebElement selectedDatesTextElement = driver.findElement(By.xpath("//div[@class='RadAjaxPanel']/span"));
		String textAfterAjaxCall = selectedDatesTextElement.getText().trim();
		
		System.out.println("---------------->"+textBeforeAjaxCall);
		System.out.println("---------------->"+textAfterAjaxCall);
		
		driver.close();
	}
	
	@BeforeTest
	
	public void beforeclass() {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium 3.0\\Selium 3.0\\Selium 3.0\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	
}

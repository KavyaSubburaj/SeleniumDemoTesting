package Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Pages.Login;
import Pages.LoginPageUsingPageFactory;
import UtilityFunctions.Browser;

public class TestCase {
	 
	WebDriver driver;
	
	/*@Test
	public void test() {
		WebDriver driver = Browser.startBrowser("chrome", "http://demoaut.com/");
		
		
		
		Login log = new Login(driver); 
		log.loginUser("tutorial", "tutorial");
	}*/
	
	@Test
	public void test() {
		WebDriver driver = Browser.startBrowser("chrome", "http://demoaut.com/");
		
		LoginPageUsingPageFactory log = PageFactory.initElements(driver, LoginPageUsingPageFactory.class);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		log.loginuser("tutorial", "tutorial");
	}
}

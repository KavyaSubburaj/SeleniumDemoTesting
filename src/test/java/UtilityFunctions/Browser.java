package UtilityFunctions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browser {
	
	static WebDriver driver;
	public static WebDriver startBrowser(String browsername, String url) {
		if(browsername.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver","C:\\Selenium 3.0\\Selium 3.0\\Selium 3.0\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		else if(browsername.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Selenium 3.0\\Selium 3.0\\Selium 3.0\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		
		driver.manage().window().maximize();
		driver.get(url);
		return driver;
	}
}

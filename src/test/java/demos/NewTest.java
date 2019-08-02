package demos;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NewTest {
	
	WebDriver driver;
	
  @Test
  public void f() throws AWTException {
	  Robot robot = new Robot();
	  
	  System.setProperty("webdriver.chrome.driver","C://Users//training_c2d.02.11//Desktop//Webdriver//chromedriver.exe");
	  driver =new ChromeDriver();
	  
	driver.get("C:\\Users\\training_c2d.02.11\\kavya\\testfile.html");
	
	driver.findElement(By.xpath("/html/body/input")).click();
	robot.setAutoDelay(1000);
	String path = "C:\\Users\\training_c2d.02.11\\kavya\\Book1.xlsx";
	
	StringSelection sel = new StringSelection(path);
	Toolkit.getDefaultToolkit().getSystemClipboard().setContents(sel, null);
	robot.setAutoDelay(1000);
	robot.keyPress(KeyEvent.VK_CONTROL);
	robot.keyPress(KeyEvent.VK_V);
	
	robot.keyRelease(KeyEvent.VK_CONTROL);
	robot.keyRelease(KeyEvent.VK_V);
	
	robot.setAutoDelay(1000);
	
	robot.keyPress(KeyEvent.VK_ENTER);
	robot.keyRelease(KeyEvent.VK_ENTER);
	
	
  }
}

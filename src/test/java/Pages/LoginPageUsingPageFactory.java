package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPageUsingPageFactory {
	
	WebDriver driver;
	
	public LoginPageUsingPageFactory(WebDriver driver) {
		this.driver=driver;
	}

	@FindBy(how=How.NAME, using="userName")
	WebElement username;
	
	@FindBy(how=How.NAME, using="passWord")
	WebElement password;
	
	@FindBy(how=How.NAME, using="login")
	WebElement signin;
	
	public void loginuser(String un, String pass) {
		username.sendKeys(un);
		password.sendKeys(pass);
		signin.click();
	}
}

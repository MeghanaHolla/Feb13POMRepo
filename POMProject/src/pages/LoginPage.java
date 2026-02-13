package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(id = "Email")
	WebElement emailIDBox;
	
	@FindBy(id = "Password")
	WebElement passwordBox;
	
	@FindBy(css = "input[value = 'Log in']")
	WebElement loginButton;
	
	public void applicationLogin(String emailID, String password) {
		emailIDBox.sendKeys(emailID);
		passwordBox.sendKeys(password);
		loginButton.click();
	}

}

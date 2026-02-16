package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage {
	
	public LandingPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//This change is done by me
	@FindBy(linkText = "Log in")
	WebElement loginLink;

	
	public void clickLoginLink() {
		loginLink.click();
	}
}

package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText = "Log out")
	WebElement logoutLink;
	
	@FindBy(linkText = "Books")
	WebElement booksLink;
	
	public boolean verifyLogoutPresent() {
		boolean isLogoutPresent = logoutLink.isDisplayed();
		return isLogoutPresent;
	}
	
	public void clickLogout() {
		logoutLink.click();
	}
	
	public void clickBooksLink() {
		booksLink.click();
	}

}

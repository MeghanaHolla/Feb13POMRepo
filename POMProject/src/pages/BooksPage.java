package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BooksPage {
	
	public BooksPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(css = "span[class='cart-qty']")
	WebElement cartQuantity;
	
	@FindBy(css = "input[value = 'Add to cart']")
	WebElement addToCartButton;
	
	public int getCartQuantity() {
		String strCartQuantity = cartQuantity.getText();
		strCartQuantity = strCartQuantity.replace("(", "");
		strCartQuantity = strCartQuantity.replace(")", "");
		int quantity = Integer.parseInt(strCartQuantity);
		return quantity;
	}
	
	public void clickAddToCart() {
		addToCartButton.click();
	}
}

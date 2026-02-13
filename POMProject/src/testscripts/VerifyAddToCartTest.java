package testscripts;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.BooksPage;
import pages.HomePage;
import pages.LandingPage;
import pages.LoginPage;

public class VerifyAddToCartTest extends Base{
	
	
	@Test
	public void addToCartTest() throws InterruptedException {
		LandingPage lp = new LandingPage(driver);
		LoginPage lop = new LoginPage(driver);
		HomePage hp = new HomePage(driver);
		BooksPage bp = new BooksPage(driver);
		
		lp.clickLoginLink();
		lop.applicationLogin("meghanah123@yopmail.com", "Abcd@123");
		hp.clickBooksLink();
		int beforeAddToCart = bp.getCartQuantity();
		bp.clickAddToCart();
		Thread.sleep(4000);
		int afterAddToCart = bp.getCartQuantity();
		Assert.assertEquals(afterAddToCart, beforeAddToCart+1);
	}
}

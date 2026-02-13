package testscripts;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.LandingPage;
import pages.LoginPage;
import utils.GenericMethods;

public class VerifyLoginTest extends Base {

	@Test
	public void verifyLogin() throws IOException {
		LandingPage lp = new LandingPage(driver);
		LoginPage loginPage = new LoginPage(driver);
		HomePage hp = new HomePage(driver);
		
		String[][] data = GenericMethods.getData("D:\\Training\\SeleniumJan_5_2026\\TestData.xlsx", "Sheet1");
		
		for(int i = 1; i< data.length; i++) {
			lp.clickLoginLink();
			loginPage.applicationLogin(data[i][0], data[i][1]);
			boolean checkLogoutPresent = hp.verifyLogoutPresent();
			Assert.assertTrue(checkLogoutPresent);
			hp.clickLogout();
		}
		
	}
	
}

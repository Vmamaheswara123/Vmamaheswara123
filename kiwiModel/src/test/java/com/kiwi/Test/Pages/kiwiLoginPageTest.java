package com.kiwi.Test.Pages;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.kiwi.base.page.TestBase;
import com.kiwi.pages.kiwiLoginPage;

public class kiwiLoginPageTest extends TestBase  {
	kiwiLoginPage KiwiLoginPage;

	public kiwiLoginPageTest() {
		super();
	}
	@BeforeMethod
	public void setUp() {
		initializaion();
		KiwiLoginPage = new kiwiLoginPage();
	}
	@Test(priority=1)
	public void HomePageTitle() {
		String kiwiLoginPageTitle = KiwiLoginPage.VerifyLogInPage();
		assertEquals(kiwiLoginPageTitle, "STEM, STEAM & Science Kits for Kids | KiwiCo");
	}
	@Test(priority=2)
	public void VerifyLoginPageTitle() {
		String VerifylginTitle = KiwiLoginPage.goToLoginPage();
		assertEquals(VerifylginTitle,"Login | KiwiCo");
	}
	@Test(priority=3)
	public void getlogo() {
		boolean verifylogo = KiwiLoginPage.loginPage();
		assertEquals(verifylogo,true);
	}
	@AfterMethod
	public void downPage() {
		driver.quit();
	}
}
package com.kiwi.Test.Pages;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.kiwi.base.page.TestBase;
import com.kiwi.pages.kiwiHomePage;
import com.kiwi.pages.kiwiLoginPage;

public class kiwiHomePgeTest extends TestBase{
	kiwiLoginPage KiwiLoginPage;
	kiwiHomePage KiwiHomePage;
	
	public kiwiHomePgeTest() {
		super();
	}
	@BeforeMethod
	public void setUp() {
		initializaion();
		KiwiLoginPage = new kiwiLoginPage();
		KiwiHomePage = new kiwiHomePage();
		KiwiHomePage = KiwiLoginPage.Login(prop.getProperty("username"),prop.getProperty("password"));
	}
	@Test(priority=1)
	public void HomePageTitle() {
		String HomePageTitle = KiwiHomePage.mCPageTitle();
		System.out.println(HomePageTitle);
	}
	@Test(priority=2)
	public void vrfyLogo() {
		boolean HomePagelogo = KiwiHomePage.makerCratePage();
		System.out.println(HomePagelogo);
	}
	@Test(priority=3)
	public void vrfyurl() {
		String HomePageurl = KiwiHomePage.mCPageTitle();
		System.out.println(HomePageurl);
	}
	@AfterMethod
	public void downPage() {
		driver.quit();
	}
}
package com.kiwi.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.kiwi.base.page.TestBase;

public class kiwiLoginPage extends TestBase {

	//Page Factory - OR;
	@FindBy(xpath = "//a[contains(text(),'Sign In')]")
	WebElement SingIn; 

	@FindBy(xpath = "//input[@type='email'][@id='loginEmail']")
	WebElement userName;

	@FindBy(xpath = "//input[@type='password'][@id='loginPassword']")
	WebElement Passwrd;

	@FindBy(css= "button[class='jsx-1116932970  button  button--space-under-default button--vibrant--filled button--default       button--sentence button--width'][type='submit']")
	WebElement SignInBtn;

	@FindBy(xpath = "//a[@aria-label='KiwiCo, Inc.']")
	WebElement vrfylogo;

	public kiwiLoginPage() {
		PageFactory.initElements(driver,this);
	}
	public String VerifyLogInPage(){
		return driver.getTitle();
	}
	public String goToLoginPage() {
		SingIn.click();
		return driver.getTitle();
	}
	public Boolean loginPage() {
		SingIn.click();
		userName.sendKeys(prop.getProperty("username"));
		Passwrd.sendKeys(prop.getProperty("password"));
		SignInBtn.click();
		return vrfylogo.isDisplayed();
	}
	public kiwiHomePage Login(String usrNm,String pswrd) {
		SingIn.click();
		userName.sendKeys(usrNm);
		Passwrd.sendKeys(pswrd);
		SignInBtn.click();

		return new kiwiHomePage();
	}
}
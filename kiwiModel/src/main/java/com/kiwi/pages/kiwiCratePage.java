package com.kiwi.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.kiwi.base.page.TestBase;

public class kiwiCratePage extends TestBase{

	//Page Factory - OR;
	@FindBy(css = "span[class='jsx-2151949561 toggle__icon']')]")
	WebElement SingIn;

	public kiwiCratePage() {
		PageFactory.initElements(driver,this);
	}
}

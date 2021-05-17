package com.kiwi.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.kiwi.base.page.TestBase;

public class kiwiHomePage extends TestBase {
	
	//Page Factory - OR;
	@FindBy(xpath = "//*[contains(text(),'Our Lines')]")
	WebElement SingIn;

	@FindBy(xpath = "//*[contains(text(),'Maker Crate')]")
	WebElement maker;
	
	@FindBy(css = "i[class*='inline-block']")
	WebElement MClogo;

	@FindBy(xpath = "//span[contains(text(),'Get it')]")
	WebElement getItbtn;

	public kiwiHomePage() {
		PageFactory.initElements(driver,this);
	}
	public Boolean makerCratePage() {
		SingIn.click();
		List<WebElement> elements = driver.findElements(By.xpath("/html/body/div[1]/header/div/ul/li[1]/div/div/ul"));
		System.out.println("Number of elements:" +elements.size());
		for (int i=0; i<elements.size();i++){
		      System.out.println("Radio button text:" + elements.get(i).getAttribute("Maker Crate"));
		}
		return MClogo.isDisplayed();
	}
	public String mCPageTitle() {
		SingIn.click();
		List<WebElement> elements = driver.findElements(By.xpath("/html/body/div[1]/header/div/ul/li[1]/div/div/ul"));
		System.out.println("Number of elements:" +elements.size());
		for (int i=0; i<elements.size();i++){
		      System.out.println("Radio button text:" + elements.get(i).getAttribute("maker"));
		}
		return driver.getTitle();
	}
	public kiwiCratePage recipientPage() {
		Select select =  new Select(SingIn);
		select.selectByVisibleText("Maker Crate");
		getItbtn.click();
		return new kiwiCratePage();
	}
}

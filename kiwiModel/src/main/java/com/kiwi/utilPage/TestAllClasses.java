package com.kiwi.utilPage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TestAllClasses {
	public static Properties prop;
	public static WebDriver driver;
	
	public static void main(String[] args) throws IOException {
		prop = new Properties();
		FileInputStream ips = new FileInputStream(System.getProperty("user.dir")+ "\\src\\main\\java\\com\\kiwi\\config\\config.properties");
		prop.load(ips);
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get(prop.getProperty("url"));
		driver.findElement(By.xpath("//a[contains(text(),'Sign In')]")).click();
		driver.findElement(By.xpath("//input[@type='email'][@id='loginEmail']")).sendKeys(prop.getProperty("username"));
		driver.findElement(By.xpath("//input[@type='password'][@id='loginPassword']")).sendKeys(prop.getProperty("password"));
		driver.findElement(By.cssSelector("button[class='jsx-1116932970  button  button--space-under-default button--vibrant--filled button--default       button--sentence button--width'][type='submit']")).click();
		driver.findElement(By.xpath("//*[contains(text(),'Our Lines')]")).click();
		//Select a = new Select(driver.findElement(By.xpath("//*[contains(text(),'Our Lines')]")));
		//a.selectByVisibleText("Maker Crate");
		System.out.println(driver.getTitle());
		//driver.quit();
	}
}	

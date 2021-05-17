package com.kiwi.base.page;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {
	public static Properties prop;
	public static WebDriver driver;
	
	public TestBase() {
		prop = new Properties();
		try {
			FileInputStream ips = new FileInputStream(System.getProperty("user.dir")+ "\\src\\main\\java\\com\\kiwi\\config\\config.properties");
			prop.load(ips);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public void  initializaion() {
		String browserName = prop.getProperty("browser");
		if(browserName.equals("chrome")){
			System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
			driver = new ChromeDriver();
		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get(prop.getProperty("url"));
	}
}

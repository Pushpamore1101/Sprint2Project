package com.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HelperClass {
	
	
public static WebDriver driver;
	

	public static WebDriver getDriver() {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\eclipse-workspace\\SeleniumProject\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		return driver;

	}
	
	
	public static void maximize() {
		driver.manage().window().maximize();

	}
	
	public static void getUrl(String txt) {
		
		driver.get(txt);

	}
	
	public static void type(WebElement element, String txt) {
		
		element.sendKeys(txt);

	}
	
	public static void btnClick(WebElement element) {
		
		element.click();

	}
	
	public static void quitBrowser() {
		driver.quit();

	}
		
				

}

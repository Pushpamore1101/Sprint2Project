package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.HelperClass;

public class HomePage extends HelperClass {
	
	public HomePage(){
		
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(name="q")
	WebElement searchBox;

	public WebElement getSearchBox() {
		return searchBox;
	}
	
	
	

}

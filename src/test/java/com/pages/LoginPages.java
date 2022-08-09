package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.HelperClass;

public class LoginPages extends HelperClass{

	
	public LoginPages(){
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="/html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input")
	WebElement username;
	
	
	@FindBy(xpath="/html/body/div[2]/div/div/div/div/div[2]/div/form/div[2]/input")
	WebElement password;
	
	
	@FindBy(xpath="/html/body/div[2]/div/div/div/div/div[2]/div/form/div[4]/button")
	WebElement loginbtn;


	public WebElement getUsername() {
		return username;
	}


	public WebElement getPassword() {
		return password;
	}


	public WebElement getLoginbtn() {
		return loginbtn;
	}
	
	
	
	
	
}

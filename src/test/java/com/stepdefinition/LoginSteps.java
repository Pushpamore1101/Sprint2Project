package com.stepdefinition;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import com.base.HelperClass;
import com.pages.LoginPages;

import io.cucumber.java.en.*;

public class LoginSteps extends HelperClass{
	
	
	LoginPages loginPages;
	@Test(priority=1)
	@Given("user is on the flipkart page")
	public void user_is_on_the_flipkart_page() throws InterruptedException {
		
		loginPages=new LoginPages();
		
		getDriver();
		driver.get("https://www.flipkart.com");
		Thread.sleep(2000);
	   //driver.switchTo().defaultContent();
	}
	@Test(priority=2)
	@When("user logins with valid username and password")
	public void user_logins_with_valid_username_and_password() throws InterruptedException {
		
	    //type(loginPages.getUsername(),"pushpamore1101@gmail.com");
	    //type(loginPages.getPassword(),"Pushpa#610");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input")).sendKeys("8356863198");
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[2]/input")).sendKeys("Pushpa#610");
		Thread.sleep(2000);
	}

	@Test(priority=3)
	@Then("user must be directed to homepage")
	public void user_must_be_directed_to_homepage() {
		  //btnClick(loginPages.getLoginbtn());
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[4]/button")).click();
		
	}



}

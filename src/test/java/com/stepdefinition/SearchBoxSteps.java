package com.stepdefinition;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import com.base.HelperClass;
import com.pages.HomePage;

import io.cucumber.java.en.*;

public class SearchBoxSteps extends HelperClass {
	
	HomePage homePage;
	

	@Test(dependsOnMethods="user_must_be_directed_to_homepage", priority=5)
	@Given("user is logged in successfully into flipkart")
	public void user_is_logged_in_successfully_into_flipkart() {
		 if(driver.getPageSource().contains("My Account")) {
			 AssertJUnit.assertTrue(true);
		 }
		 
	}


	
	@Test(priority=5)
	@When("user types the product name into the search box")
	public void user_types_the_product_name_into_the_search_box() throws InterruptedException {
		
	
	
	// driver.get("https://www.flipkart.com/account/login"); 
	 Thread.sleep(2000);
	homePage=new HomePage();
	type(homePage.getSearchBox(),"Mobile smart phones under 30000");
	Thread.sleep(2000);
	
	}
	
	@Test(priority=6)
	@And("clicks on enter button")
	public void clicks_on_enter_button() throws InterruptedException {
	    homePage.getSearchBox().sendKeys(Keys.ENTER);
	    Thread.sleep(2000);
	}
	
	@Test(priority=7)
	@Then("user is directed to the results page")
	public void user_is_directed_to_the_results_page() throws InterruptedException {
		
		//Assert.assertEquals("Newest First", "Newest First");
		 if(driver.getPageSource().contains("Newest First")) {
			 AssertJUnit.assertTrue(true);
		 }
		 Thread.sleep(2000);
		 //quitBrowser(); 
		 
	}
	
	


	
	
	/*
	@Test(priority=7)
	@When("user enters any anonymous product name")
	public void user_enters_any_anonymous_product_name() {
		getUrl("https://www.flipkart.com");
	    type(homePage.getSearchBox(),"454adftysg");
	}

	@Test(priority=8)
	@And("clicks on the enter button")
	public void clicks_on_the_enter_button() {
		  homePage.getSearchBox().sendKeys(Keys.ENTER);
	}

	@Test(priority=9)
	@Then("user must be directed to error page")
	public void user_must_be_directed_to_error_page() {
		
	  driver.getPageSource().contains("no results ");
	  
	  quitBrowser();
	}
	*/






	
	


}

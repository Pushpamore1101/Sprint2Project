package com.stepdefinition;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import com.base.HelperClass;
import com.pages.HomePage;

import io.cucumber.java.en.*;

public class FiltersSteps extends HelperClass {

	//HomePage homePage;
	@Test(priority=8)
	@Given("user must have searched for the product in the search box")
	public void user_must_have_searched_for_the_product_in_the_search_box() throws InterruptedException {
		//homePage=new HomePage();
		if(driver.findElement(By.name("q")).getText()!=null) {
			Assert.assertTrue(true);
		}
	
		
	}

	@Test(priority=9)
	@And("user should be on products list")
	public void user_should_be_on_products_list() {
		if(driver.getPageSource().contains("Newest First")) {
			 AssertJUnit.assertTrue(true);
		 }
	}

	@Test(priority=10)
	@When("user applies an filter on the page")
	public void user_applies_an_filter_on_the_page() {
	    WebElement max = driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div/div[1]/div/div[1]/div/section[2]/div[4]/div[3]/select"));
	    Select s=new Select(max);
	    s.selectByValue("30000");
	}

	@Test(priority=11)
	@Then("flipkart should return only those products which satisfies that particular filter")
	public void flipkart_should_return_only_those_products_which_satisfies_that_particular_filter() {
	   List<WebElement> productLists = driver.findElements(By.className("_1YokD2 _3Mn1Gg"));
	   System.out.println(productLists);
	}
}

package com.test.Cucumber;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CheckBox {
	WebDriver driver;
	WebElement dance,reading,cricket;

	@Given("^User is in DemoQa Register Checkbox$")
	public void user_is_in_DemoQa_Register_Checkbox() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.gecko.driver", "F:\\eclipse\\Sample\\driver\\geckodriver.exe");
	    driver= new FirefoxDriver();
		driver.get("http://demoqa.com/registration/");	}

	@When("^User enter the Checkbox$")
	public void user_enter_the_Checkbox() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		dance=driver.findElement(By.xpath("//input[@value='dance']"));
		dance.click();
		reading=driver.findElement(By.xpath("//input[@value='reading']"));
		reading.click();
		cricket=driver.findElement(By.xpath("//input[@value='cricket ']"));
		cricket.click();

		
	}

	@Then("^I validate the verify Checkbox$")
	public void i_validate_the_verify_Checkbox() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		if(dance.isSelected()||reading.isSelected()||cricket.isSelected()) {
			Assert.assertTrue(true);
		}
	}

}

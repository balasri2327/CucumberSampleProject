package com.test.Cucumber;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class New {
	WebDriver driver;
	WebElement googleSearch,click;
    private String searchSelenium = "Selenium";
    private String searchCucumber = "Cucumber";
    private String searchTestNg = "TestNG";


	@Given("^I want to write a step with \"([^\"]*)\"$")
	public void i_want_to_write_a_step_with(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.gecko.driver", "F:\\eclipse\\Sample\\driver\\geckodriver.exe");
	    driver= new FirefoxDriver();
		driver.get("https://www.google.co.in/?gfe_rd=cr&dcr=0&ei=WD-7WrPBC-HnugTPjbeQCA");	
		}
	@When("^I check for the \"([^\"]*)\"$")
	public void i_check_for_the(String name) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		googleSearch=driver.findElement(By.id("lst-ib"));
		googleSearch.sendKeys(name);
		click=driver.findElement(By.xpath("//input[@value='Google Search']"));
		click.click();	
		}

	@Then("^I verify the \"([^\"]*)\"$")
	public void i_verify_the(String name) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		List<WebElement> result=driver.findElements(By.tagName("div"));
		  for (int i = 0; i < result.size(); i++) {
			  if(result.get(i).getText().contains(searchSelenium)&& result.get(i).getText().contains(searchCucumber)&& result.get(i).getText().contains(searchTestNg) ) {
				  Assert.assertTrue(true);
			  }
		
		  }
	}
	
}

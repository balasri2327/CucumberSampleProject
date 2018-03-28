package com.test.Cucumber;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class DemoQaForCucumber {
WebDriver driver;
WebElement firstName,lastName;
@Given("^The user is in DemoQa registration page\\.$")
public void the_user_is_in_DemoQa_registration_page() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	System.setProperty("webdriver.chrome.driver", "F:\\eclipse\\Sample\\driver\\chromedriver.exe");
    driver= new ChromeDriver();
	driver.get("http://demoqa.com/registration/");

}

@When("^The user enter firstname and lastname$")
public void the_user_enter_firstname_and_lastname() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	firstName=driver.findElement(By.id("name_3_firstname"));
	firstName.sendKeys("Bala");
	lastName=driver.findElement(By.id("name_3_lastname"));
	lastName.sendKeys("sri");
}

@Then("^The user verify the entered text in firstname and lastname field$")
public void the_user_verify_the_entered_text_in_firstname_and_lastname_field() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    Assert.assertEquals("Bala", firstName.getAttribute("value"));
    Assert.assertEquals("sri", lastName.getAttribute("value"));
  //  Assert.assertEquals("Bala", firstName.getText());

}

}









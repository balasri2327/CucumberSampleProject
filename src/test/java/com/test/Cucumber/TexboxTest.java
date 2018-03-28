package com.test.Cucumber;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class TexboxTest {
	WebDriver driver;
	WebElement firstName,lastName,phonenumber,username,email,aboutyourSelf,password,confirmPassword;

	@Given("^User is in Register page$")
	public void user_is_in_Register_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.gecko.driver", "F:\\eclipse\\Sample\\driver\\geckodriver.exe");
	    driver= new FirefoxDriver();
		driver.get("http://demoqa.com/registration/");

	}

	@When("^User enter the firstname and lastname and phonenumber and username and email and about yourself and password and cofirmpassword$")
	public void user_enter_the_firstname_and_lastname_and_phonenumber_and_username_and_email_and_about_yourself_and_password_and_cofirmpassword() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		firstName=driver.findElement(By.id("name_3_firstname"));
		firstName.sendKeys("Bala");
		lastName=driver.findElement(By.id("name_3_lastname"));
		lastName.sendKeys("sri");
		phonenumber=driver.findElement(By.id("phone_9"));
		phonenumber.sendKeys("9952706659");
		username=driver.findElement(By.id("username"));
		username.sendKeys("balari");
		email=driver.findElement(By.id("email_1"));
		email.sendKeys("bala23december@gmail.com");
		aboutyourSelf=driver.findElement(By.id("description"));
		aboutyourSelf.sendKeys("say something");
		password=driver.findElement(By.id("password_2"));
		password.sendKeys("123456");
		confirmPassword=driver.findElement(By.id("confirm_password_password_2"));
		confirmPassword.sendKeys("123456");
	}

	@Then("^I validate the entered firstname and lastname and phonenumber and username and email and about yourself and password and cofirmpassword$")
	public void i_validate_the_entered_firstname_and_lastname_and_phonenumber_and_username_and_email_and_about_yourself_and_password_and_cofirmpassword() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		 Assert.assertEquals("Bala", firstName.getAttribute("value"));
		 Assert.assertEquals("sri", lastName.getAttribute("value"));	
		 Assert.assertEquals("9952706659", phonenumber.getAttribute("value"));
		 Assert.assertEquals("balari", username.getAttribute("value"));
		 Assert.assertEquals("bala23december@gmail.com", email.getAttribute("value"));
		 Assert.assertEquals("say something", aboutyourSelf.getAttribute("value"));
		 Assert.assertEquals("123456", password.getAttribute("value"));
		 Assert.assertEquals("123456", confirmPassword.getAttribute("value"));
	}

}

package com.test.Cucumber;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Hello world!
 *
 */
public class App 

{
static WebDriver driver;
static WebElement googleSearch;
static WebElement click;
	public static void main( String[] args )
    {
    	System.setProperty("webdriver.gecko.driver", "F:\\eclipse\\Sample\\driver\\geckodriver.exe");
	    driver= new FirefoxDriver();
		driver.get("https://www.google.co.in/?gfe_rd=cr&dcr=0&ei=rZe7WvCPMuaeX9XtqcgC");	
		googleSearch=driver.findElement(By.id("lst-ib"));
		googleSearch.sendKeys("Ball");
		click=driver.findElement(By.xpath("//input[@value='Google Search']"));
		click.click();	
	
        System.out.println(driver.findElement(By.xpath("//span[text()='Selenium']")).getText() );
    }
}

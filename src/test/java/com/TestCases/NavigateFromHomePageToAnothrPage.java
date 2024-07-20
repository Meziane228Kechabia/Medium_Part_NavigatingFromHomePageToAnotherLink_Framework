package com.TestCases;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.nopCommerce.Pages.HomePage;
import com.nopCommerce.Pages.JewelryHomePage;
import com.nopCommerce.TestBase.TestBase;

public class  NavigateFromHomePageToAnothrPage extends TestBase {
	public WebDriver driver;
	public HomePage homePage;
	public JewelryHomePage jewelryHomePage;
	
	
	  public NavigateFromHomePageToAnothrPage() throws Exception{ 
		  super();		  
	  }
		
@BeforeMethod
public void checkoutSetup() {
	driver = openingApplicationWithAnyBrowser(prop.getProperty("browser"));
    homePage = new HomePage(driver);    
   	}

@Test(priority=1)
public void vrifyingElemntHomePageAndClickOnLinkToNavToDifferntPage() {
//Assertion of presence of the "Welcome to our Store" text in the home page of the website
	String ExpectedTextMessage = "Welcome to our store";
	String ActualTextMessage = driver.findElement(By.xpath("//div[@class='topic-block-title']")).getText();
	assertTrue(ActualTextMessage.contains(ExpectedTextMessage));
//Clicking on a link to navigate to different page	
	homePage.clickOnJewelryHomePageIcon();		
 }

@AfterMethod
public void tearDown() {	
	driver.quit();
	}
}



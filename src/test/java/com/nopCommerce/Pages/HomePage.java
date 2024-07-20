package com.nopCommerce.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	public WebDriver driver;
	
	@FindBy(xpath ="/html/body/div[6]/div[2]/ul[1]/li[6]/a")
	private WebElement jewelryHomePageLink;
	

	public HomePage (WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
			
	public JewelryHomePage clickOnJewelryHomePageIcon() {
		jewelryHomePageLink.click();
			return new JewelryHomePage(driver);
	}	
}


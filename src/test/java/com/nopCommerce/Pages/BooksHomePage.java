package com.nopCommerce.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BooksHomePage {
	public WebDriver driver;
	// this WebElement is  used in homePage instead of here	
		//@FindBy(linkText ="Books")
		//private WebElement booksHomePageLink;
		
		@FindBy(xpath ="//*[@id=\"main\"]/div/div[3]/div/div[2]/div[2]/div[2]/div/div/div[3]/div/div[1]/a")
		private WebElement prideAndPrejudiceBook;

		// This will be used in AddToCartPage	
//		@FindBy(id = "add-to-cart-button-39")
//		private WebElement prideAndPrejudiceBookAddToCartButton;
		
		public BooksHomePage (WebDriver driver) {
			this.driver = driver;
			PageFactory.initElements(driver, this);
		} 
	// this method used is used homePage instead of here
		//public BooksHomePage clickOnBooksHomePageIcon() {
		//	booksHomePageLink.click();
			//return new BooksHomePage(driver);
		//}
		public BooksHomePage clickOnPrideAndPrejudiceBook() {
			prideAndPrejudiceBook.click();
			return new BooksHomePage(driver);
		}
		
	//// This will be used in AddToCartPage
//		public BooksHomePage clickOnprideAndPrejudiceBookAddToCartButton() {
//			prideAndPrejudiceBookAddToCartButton.click();
//			return new BooksHomePage(driver);
//		}

	}

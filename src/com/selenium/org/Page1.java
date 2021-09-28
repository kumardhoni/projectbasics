package com.selenium.org;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Page1 {
	public static WebDriver driver;
	
	@FindBy(xpath = "//a[text()='Create New Account']")
	private WebElement signin_btn;

	public Page1(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);

	
	}

	public WebElement getSignin_btn() {
		return signin_btn;
	}
	
	


}

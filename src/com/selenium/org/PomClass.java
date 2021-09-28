package com.selenium.org;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PomClass extends BaseClass{
	public static WebDriver driver;
public static void main(String[] args) {
	driver=browserLaunch("chrome");
	getUrl("https://www.facebook.com");
	
	Page1 pa=new Page1(driver);
	clickOnElement(pa.getSignin_btn());
	
	Page2 pat=new Page2(driver);
	inputValue(pat.getFname(),"arun");
} 
}

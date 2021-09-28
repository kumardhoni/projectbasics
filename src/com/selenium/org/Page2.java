package com.selenium.org;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Page2 {
	public static WebDriver driver;
	@FindBy(xpath = "(//input[@class='inputtext _58mg _5dba _2ph-'])[1]")
	private WebElement fname;
	public Page2(WebDriver driver2) {
     this.driver=driver2;
PageFactory.initElements(driver,this);
	
	}
	public WebElement getFname() {
		return fname;
	}
	
	
	
	

}

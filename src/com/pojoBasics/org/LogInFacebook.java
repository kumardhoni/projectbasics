package com.pojoBasics.org;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LogInFacebook {
	@FindBy(id="email")
	public static WebElement username;
	@FindBy(xpath =" //input[@type='password']")
	public static WebElement password;
	
	@FindBy(id="u_0_d_fA")
	public static WebElement click;
}

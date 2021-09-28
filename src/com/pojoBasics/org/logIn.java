package com.pojoBasics.org;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class logIn {
	public static void main (String[]args) throws InterruptedException {
      System.setProperty("webdriver.chrome.driver","C:\\Users\\vickey kumar\\eclipse-workspace\\SeleniumBasics\\Driver1\\chromedriver.exe");
      WebDriver driver=new ChromeDriver();
      driver.get("https://www.facebook.com/");
      Thread.sleep(3000);
      driver.manage().window().maximize();
		
		PageFactory.initElements(driver, LogInFacebook.class);
		LogInFacebook.username.sendKeys("kumar07csk@gmail.com");
		LogInFacebook.password.sendKeys("1233456757");
		LogInFacebook.click.click();
		
		
	}
}

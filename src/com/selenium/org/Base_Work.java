package com.selenium.org;



import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Base_Work extends BaseClass  {
         public static WebDriver driver;
	public static void main(String[] args) throws IOException, InterruptedException {
		
	driver= browserLaunch("chrome");
	
	getUrl("https://www.facebook.com");

	
	WebElement signin = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
	clickOnElement(signin);
Thread.sleep(5000);
	
	WebElement fname = driver.findElement(By.xpath("(//input[@class='inputtext _58mg _5dba _2ph-'])[1]"));
	inputValue(fname, "arun");
	
	WebElement surname = driver.findElement(By.xpath("(//input[@type='text'])[3]"));
   inputValue(surname,"kumar");
   
   WebElement email = driver.findElement(By.xpath("//input[@name='reg_email__']"));
   inputValue(email,"6380360310");
   
   WebElement password = driver.findElement(By.xpath("(//input[@type='password'])[2]"));
   inputValue(password,"12@348");
   
   WebElement date = driver.findElement(By.xpath("//select[@name='birthday_day']"));
   dropDown(date, "select", 28);
   
   WebElement month = driver.findElement(By.xpath("//select[@name='birthday_month']"));
   dropDown(month, "select", 7);
   
   WebElement year = driver.findElement(By.xpath("//select[@aria-label='Year']"));
   dropDown(year, "select",22);
   
   WebElement gender = driver.findElement(By.xpath("//label[text()='Male']"));
   clickOnElement(gender);
   
   WebElement signup = driver.findElement(By.xpath("(//button[text()='Sign Up'])[1]"));
	clickOnElement(signup);
	
	}

}

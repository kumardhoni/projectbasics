package com.selenium.org;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day2 {
	public static void main(String[] args) throws  InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\vickey kumar\\eclipse-workspace\\SeleniumBasics\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");

		
		  driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		  driver.manage().window().maximize();
		  driver.manage().deleteAllCookies();
		  
		  WebElement findElement = driver.findElement(By.xpath("//input[@type='text']"));
		  findElement.sendKeys("abcd");
		  Thread.sleep(3000);
		  
		  TakesScreenshot ts=(TakesScreenshot) driver; 
		  File src=ts.getScreenshotAs(OutputType.FILE);
		  File Destination=new File("C:\\Users\\vickey kumar\\eclipse-workspace\\SeleniumBasics\\Screenshot\\kumar.png");
	
		  FileUtils.copyFile(src,Destination);
		  
	}

}

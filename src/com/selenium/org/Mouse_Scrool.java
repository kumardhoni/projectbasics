package com.selenium.org;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mouse_Scrool {
	public static void main(String[] args) throws InterruptedException, AWTException {

		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		Thread.sleep(4000);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		WebElement tps = driver.findElement(By.xpath("//img[@title='Upto 80% off on Watches']"));
		js.executeScript("arguments[0].scrollIntoView();",tps);
		/*
		 * JavascriptExecutor js=(JavascriptExecutor)driver;
		 * js.executeScript("window.scrollBy(0,300);");
		 */
		/*
		 * WebElement amazon =
		 * driver.findElement(By.xpath("//div[@class='nav-logo-base nav-sprite']"));
		 * js.executeScript("arguments[0].scrollIntoView();",amazon);
		 * Thread.sleep(3000); WebElement amazon1 = driver.findElement(By.
		 * xpath("(//h2[@class='a-color-base headline truncate-2line'])[1]"));
		 * 
		 * js.executeScript("arguments[0].scrollIntoView();",amazon1);
		 */
            
		
            
            
            
            
            
            
}
}
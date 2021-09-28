package com.selenium.org;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {
	public static void main(String []args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\vickey kumar\\eclipse-workspace\\SeleniumBasics\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
	driver.get("http://demo.automationtesting.in/Frames.html");
	
	driver.manage().window().maximize();
	
	Thread.sleep(5000);

	
 WebElement click = driver.findElement(By.xpath("(//a[@class='analystic'])[1]"));	
	
	driver.switchTo().frame(click);	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	

}

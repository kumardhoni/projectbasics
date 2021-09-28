package com.selenium.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\vickey kumar\\eclipse-workspace\\SeleniumBasics\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	//	driver.get("https://play.google.com/store/apps");
		
		//WebElement youtube = driver.findElement(By.xpath("//div[@id='fcxH9b']/div[4]/c-wiz/div/c-wiz/c-wiz/c-wiz/div/div[2]/div/c-wiz/div/div/div/div/div/c-wiz/div/div/div/div/main/c-wiz/c-wiz/div/div/div/img"));
        // youtube.click();
		driver.get("https://www.facebook.com/");
		
		
		WebElement findElement = driver.findElement(By.xpath("//input[@ type='text']"));
		
		findElement.sendKeys("9952398662");
		
		
		WebElement findElement2 = driver.findElement(By.xpath("//input[@ type='password']"));
		
		findElement2.sendKeys("9952398662");
		
		WebElement findElement3 = driver.findElement(By.xpath("//*[@id=\"u_0_b\"]"));
		
		findElement3.click();
		
		
		
		
		
		
		
	}

}

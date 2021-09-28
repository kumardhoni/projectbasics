package com.org.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BrosersBasic {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\vickey kumar\\eclipse-workspace\\SeleniumBasics\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		WebElement findElement2 = driver.findElement(By.xpath("//*[@id=\"u_0_2\"]"));
		findElement2.click();
		Thread.sleep(2000);
		
		WebElement findElement3 = driver.findElement(By.id("(//label[@class='_58mt'])[2]"));
		Select s2=new Select(findElement3);
		s2.selectByVisibleText("male");
		Thread.sleep(3000);
		
		}

}

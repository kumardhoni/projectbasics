package com.selenium.org;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LoginAccount {
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		
		WebElement duck = driver.findElement(By.xpath("(//a[@rel='nofollow'])[1]"));
		duck.click();
		
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		WebElement email = driver.findElement(By.xpath("(//input[@name='email'])[1]"));
		email.sendKeys("murugan28799@gmail.com");
		
		
		  WebElement pasword= driver.findElement(By.id("passwd"));
		  pasword.sendKeys("28799");
		  
		  
		  WebElement btn_click=
		  driver.findElement(By.xpath("//i[@class='icon-lock left']"));
		  btn_click.click();
		  
		  driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		  
		Actions ac= new Actions(driver);
		  WebElement women = driver.findElement(By.xpath("//a[@title='Women']"));
		  ac.contextClick(women).build().perform();
		  
		  WebElement tshirt = driver.findElement(By.xpath("(//a[@title='T-shirts'])[1]"));
		  tshirt.click();
		  
		  
		  WebElement tops = driver.findElement(By.xpath("(//img[@class='replace-2x img-responsive'])[1]"));
		  tops.click();
		  
		  
		  
		  WebElement add = driver.findElement(By.xpath("//span[text()='Add to cart']"));
		  add.click();
		  driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		  
		  
		  WebElement add3 = driver.findElement(By.xpath("(//i[@class='icon-chevron-right right'])[2]"));
		  add3.click();
		  
		  
		  
		
		  WebElement add1 = driver.findElement(By.xpath("(//i[@class='icon-chevron-right right'])[3]"));
		  
		  add1.click();
		  
		  WebElement show= driver.findElement(By.xpath("//a[@title='View my shopping cart']"));
		 show.click();
		  
		  
		
	}
	
	
	

}

package com.selenium.org;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Work2 extends BaseClass {
public static WebDriver river;
	public static void main(String[] args) throws Throwable {
		driver = browserLaunch("chrome");
		getUrl("http://automationpractice.com/index.php");
	
		WebElement signin = driver.findElement(By.xpath("(//a[@rel='nofollow'])[1]"));
	clickOnElement(signin);
	
	WebElement email= driver.findElement(By.xpath("//input[@id='email']"));
	inputValue(email,"murugan28799@gmail.com");
	
	WebElement pass= driver.findElement(By.xpath("//input[@type='password']"));
	inputValue(pass,"28799");
	
	WebElement signin2= driver.findElement(By.xpath("//i[@class='icon-lock left']"));
	clickOnElement(signin2);
	
	
	WebElement women= driver.findElement(By.xpath("//a[@title='Women']"));
	action(women,"right click");
	
	
	WebElement wsub= driver.findElement(By.xpath("(//a[@title='T-shirts'])[1]"));
	clickOnElement(wsub);
	
	WebElement img= driver.findElement(By.xpath("(//img[@class='replace-2x img-responsive'])[2]"));
	clickOnElement(img);
	Thread.sleep(3000);
//	WebElement cat = driver.findElement(By.id("category"));
//	frame(cat);
	driver.switchTo().frame(0);
	Thread.sleep(3000);
	WebElement id = driver.findElement(By.id("group_1"));
	dropDown(id, "select", 2);
	Thread.sleep(3000);
	WebElement add = driver.findElement(By.xpath("//*[@id=\"add_to_cart\"]/button/span"));
	clickOnElement(add);
	Thread.sleep(3000);
	WebElement add2 = driver.findElement(By.xpath("//a[@class='btn btn-default button button-medium']"));
	clickOnElement(add2);
   
	
	
	
	
	
	
	
	
	
	
	
	}
	
	
	
	
	

}

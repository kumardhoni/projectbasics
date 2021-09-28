package com.selenium.org;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Practice {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		WebElement duck = driver.findElement(By.xpath("(//a[@rel='nofollow'])[1]"));
		duck.click();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		WebElement create1= driver.findElement(By.id("email_create"));
		create1.sendKeys("murugan28799@gmail.com");
		
		
		WebElement btn_click= driver.findElement(By.xpath("//i[@class='icon-user left']"));
		btn_click.click();
		
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	    WebElement gender = driver.findElement(By.xpath("(//input[@type='radio'])[1]"));
	    gender.click();
		
		  WebElement firstname = driver.findElement(By.id("customer_firstname"));
		  firstname.sendKeys("kumar"); WebElement lastname =
		  driver.findElement(By.id("customer_lastname")); lastname.sendKeys("csk");
		  
		  
		  WebElement passwd = driver.findElement(By.id("passwd"));
		  passwd.sendKeys("28799");
		  
		  WebElement days =driver.findElement(By.id("days")); Select s=new
		  Select(days); s.selectByValue("27");
		  
		  WebElement months = driver.findElement(By.id("months")); Select s1=new
		  Select(months); s1.selectByValue("7");
		  
		  WebElement years = driver.findElement(By.id("years")); Select s2=new
		  Select(years); s2.selectByValue("1999");
		  
		  WebElement company = driver.findElement(By.id("company"));
		  company.sendKeys("cognisent");
		  
		  WebElement adress = driver.findElement(By.id("address1"));
		  adress.sendKeys("2/10");
		  
		  WebElement adress2 = driver.findElement(By.id("address2"));
		  adress2.sendKeys("palla street");
		  
		  Thread.sleep(5000); WebElement city = driver.findElement(By.id("city"));
		  city.sendKeys("miami");
		  
		  
		  WebElement state = driver.findElement(By.id("id_state"));
		  state.sendKeys("Florida");
		  
		  
		  WebElement passcode = driver.findElement(By.id("postcode"));
		  passcode.sendKeys("12345");
		  
		  WebElement country = driver.findElement(By.id("id_country"));
		  country.sendKeys("United States");
		  
		  WebElement other = driver.findElement(By.id("other"));
		  other.sendKeys("nera ksp mahal");
		  
		  WebElement phone = driver.findElement(By.id("phone"));
		  phone.sendKeys("6380361842");
		  
		  
		  WebElement mobile = driver.findElement(By.id("phone_mobile"));
		  mobile.sendKeys("6380360310");
		  
		  
		  WebElement register =driver.findElement(By.xpath("(//input[@name='alias'])[1]"));
		  register.sendKeys("chennai");
		  
		  WebElement register1 =driver.findElement(By.xpath("//span[text()='Register']"));
		  register1.click();
		  driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		 
		  
		  
		  
		
		  
		/*
		 * TakesScreenshot ts=(TakesScreenshot)driver; File source
		 * =ts.getScreenshotAs(OutputType.FILE);
		 * 
		 * 
		 * File destination = new
		 * File("C:\\Users\\vickey kumar\\eclipse-workspace\\SeleniumBasics\\Screenshot\\arun.png"
		 * ); FileUtils.copyFile(source, destination);
		 * 
		 */
		
		
		
		
		
		
		
		
		
	}

	
}

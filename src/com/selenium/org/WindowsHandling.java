package com.selenium.org;



import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WindowsHandling {
	public static void main(String[] args) throws InterruptedException, AWTException {

	System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.in/");
	driver.manage().window().maximize();
	Thread.sleep(4000);
	Actions ac=new Actions(driver);
	Robot r=new Robot();
	WebElement fashion = driver.findElement(By.xpath("(//a[@data-csa-c-type='link'])[1]"));
    ac.contextClick(fashion).build().perform();
    
    r.keyPress(KeyEvent.VK_DOWN);
    r.keyRelease(KeyEvent.VK_DOWN);
		/*
		 * r.keyPress(KeyEvent.VK_DOWN); r.keyRelease(KeyEvent.VK_DOWN);
		 * r.keyPress(KeyEvent.VK_DOWN); r.keyRelease(KeyEvent.VK_DOWN);
		 * r.keyPress(KeyEvent.VK_DOWN); r.keyRelease(KeyEvent.VK_DOWN);
		 * r.keyPress(KeyEvent.VK_DOWN); r.keyRelease(KeyEvent.VK_DOWN);
		 * r.keyPress(KeyEvent.VK_DOWN); r.keyRelease(KeyEvent.VK_DOWN);
		 */
    r.keyPress(KeyEvent.VK_ENTER);
    r.keyRelease(KeyEvent.VK_ENTER);
    
  
   WebElement electronics = driver.findElement(By.xpath("//a[@href='/mobile-phones/b/?ie=UTF8&node=1389401031&ref_=nav_cs_mobiles_3c6296a4c0bc4246995c699b7d51902b']"));
   ac.contextClick(electronics).build().perform();
   r.keyPress(KeyEvent.VK_DOWN);
   r.keyRelease(KeyEvent.VK_DOWN);
   
   r.keyPress(KeyEvent.VK_ENTER);
   r.keyRelease(KeyEvent.VK_ENTER);
   
   String windowHandle = driver.getWindowHandle();
    Set<String> allid = driver.getWindowHandles();
    for (String id : allid) {
    	String title = driver.switchTo().window(id).getTitle();
    	System.out.println(title);
    	
   
	}
   
   String actualtitle="Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in" ;
   for (String id : allid) {
	if (driver.switchTo().window(id).getTitle().equals(actualtitle)) {
		break;
		
	}
}
    
    
   
   
   
   
   
   
   
   
   
    
}
}
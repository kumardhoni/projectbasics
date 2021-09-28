package com.selenium.org;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions_Basics {
	public static void main(String[] args) throws InterruptedException, AWTException {
	System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://automationpractice.com/index.php");
	Thread.sleep(4000);
	driver.manage().window().maximize();
	Thread.sleep(4000);

	 WebElement women = driver.findElement(By.xpath("//a[@title='Women']"));
	  Actions act=new Actions(driver);
	  act.moveToElement(women).build().perform();
	  
		
		  WebElement modern = driver.findElement(By.xpath("(//a[@title='Casual Dresses'])[1]"));
		  
		  act.moveToElement(modern).build().perform();
		  act.click(modern);
		 
	  WebElement sin = driver.findElement(By.xpath("//a[@class='login']"));
	 act.contextClick(sin);
	  Robot r=new Robot();
	 	 r.keyPress(KeyEvent.VK_DOWN);
	 	 r.keyRelease(KeyEvent.VK_DOWN);
	 	 
	 	 r.keyPress(KeyEvent.VK_DOWN);
	 	 r.keyRelease(KeyEvent.VK_DOWN);
	 	 
	 	 r.keyPress(KeyEvent.VK_ENTER);
	 	 r.keyRelease(KeyEvent.VK_ENTER);	 	

}
}

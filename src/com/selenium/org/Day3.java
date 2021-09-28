package com.selenium.org;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day3 {
	public static void main(String[] args) throws InterruptedException {
      
  System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\driver\\chromedriver.exe");
  WebDriver driver=new ChromeDriver();
  driver.manage().window().maximize();
  driver.get("https://www.seleniumeasy.com/test/javascript-alert-box-demo.html");
  
  WebElement button_click = driver.findElement(By.xpath("//button[@class='btn btn-default']"));
  button_click.click();
  Alert alert = driver.switchTo().alert();
  String text = alert.getText();
  System.out.println("text:"+text);
  Thread.sleep(3000);
  alert.accept();

WebElement button_click2 = driver.findElement(By.xpath("//button[@class='btn btn-default btn-lg']"));
button_click2.click();
Alert alert2 = driver.switchTo().alert();
String text2 = alert2.getText();
System.out.println("text2"+text2);
Thread.sleep(3000);
alert2.dismiss();


	}
}

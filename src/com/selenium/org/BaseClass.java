package com.selenium.org;


import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {
public static WebDriver driver; 
	public static WebDriver browserLaunch(String type)
	{
		if (type.equalsIgnoreCase("chrome")) {
		
			
		
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
		 driver=new ChromeDriver();
		
		}
		driver.manage().window().maximize();
	return driver;
	}
	public static void getUrl(String url) {
		
		driver.get(url);
		
	}
	public static void get(String url) {
		if (url.equalsIgnoreCase("title")) {
			driver.getTitle();
		}
		else if (url.equalsIgnoreCase("current url")) {
			driver.getCurrentUrl();
			
		}
		
	}
	
	
	
	public static void clickOnElement(WebElement element) {
		element.click();
	}
	
	
	public static void inputValue(WebElement element,String value) {
		element.sendKeys(value);
		
		
	}
	
	
	public static void close() {
		driver.close();
	}
	public static void quit() {
		driver.quit();
	}
	
	
	
	public static void snap(String folder) throws IOException {
		
		TakesScreenshot ts=(TakesScreenshot) driver;
		
		
		File f1 = ts.getScreenshotAs(OutputType.FILE);
		File f2=new File(folder);
		FileUtils.copyFile(f1, f2);

	}
	
	
	public static void navigateTo(String url) {
		driver.navigate().to(url);
	}
	
	public static void back() {
		driver.navigate().back();
	}
	public static void forWard() {
		driver.navigate().forward();
	}
	
	public static void refresh() {
		
		driver.navigate().refresh();
	}
	
	public static void getTitle() {
		String title1 = driver.getTitle();
		System.out.println(title1);
	}
	
	public static void pageLoad(int w) {
		driver.manage().timeouts().pageLoadTimeout(w, TimeUnit.SECONDS);
	}
	
	public static void dropDown(WebElement element,String type,int value) {
		Select s=new Select(element);
		
		if (type.equalsIgnoreCase("select")) {
			s.selectByIndex(value);
			
		
			
		}
		else if (type.equalsIgnoreCase("getoptions")) {
			System.out.println("***list of options***");
			List<WebElement> options = s.getOptions();
			for (WebElement getoptions : options) {
				String text = getoptions.getText();
				System.out.println(text);	
			}
		}
			else if (type.equalsIgnoreCase("multiple")) {
				boolean multiple = s.isMultiple();
				System.out.println(multiple);
			}
			else if (type.equalsIgnoreCase("multiple select")) {
				for (int i = 0; i < 8; i++) {
					if (i==value) {
						s.selectByIndex(i);
						System.out.println(i);
						
					}
					
				}
				
			}
			
			else if (type.equalsIgnoreCase("first selected")) {
				System.out.println("***first selected***");
				WebElement firstSelected = s.getFirstSelectedOption();
				String text = firstSelected.getText();
				System.out.println(text);
			}	
		
			else if (type.equalsIgnoreCase("all selected")) {
				System.out.println("***all selected***");
				List<WebElement> all = s.getAllSelectedOptions();
				for (WebElement allselected : all) {
					String text = allselected.getText();
					System.out.println(text);
				}
			}
	}
public static void action(WebElement element,String type) {
	if (type.equalsIgnoreCase("move")) {
		Actions a=new Actions(driver);
		a.moveToElement(element).build().perform();
	}
	else if (type.equalsIgnoreCase("right click")) {
		Actions ac =new Actions(driver);
		ac.contextClick(element).build().perform();
		
	}
	
	
}

public static void frame(WebElement element) {
	driver.switchTo().frame(element);
}

public static void getText(WebElement element) {
	String text = element.getText();
	System.out.println(text);
}

public static void getAttribute(WebElement element,String type) {
	if (type.equalsIgnoreCase("value")) {
		String at = element.getAttribute("value");
		System.out.println(at);
	}
	else if (type.equalsIgnoreCase("name")) {
		String at2 = element.getAttribute("name");
		System.out.println(at2);
		
	}	
}

public static void alert(String type) {
	if (type.equalsIgnoreCase("simple")) {
		Alert simp = driver.switchTo().alert();
		simp.accept();
		
	}
	else if (type.equalsIgnoreCase("conform")) {
		Alert conform = driver.switchTo().alert();
		conform.dismiss();
		
	}
	
}
public static void robot(int value) throws Throwable {
Robot r=new Robot();	
for (int i = 0; i < value; i++) {
	r.keyPress(KeyEvent.VK_DOWN);
	r.keyRelease(KeyEvent.VK_DOWN);
	r.keyPress(KeyEvent.VK_ENTER);
}
	
}
public static void windowhamdles(String mytitle) {
	Set<String> all = driver.getWindowHandles();
	for (String allid : all) {
	String title = driver.switchTo().window(allid).getTitle();
		System.out.println(title);
	}
	for (String allid : all) {
		if ( driver.switchTo().window(allid).getTitle().equals(mytitle)) {
			break;
		}
		
	}
}


public static void is(String type,WebElement element) {
	if (type.equalsIgnoreCase("enabled")) {
		boolean enabled = element.isEnabled();
		System.out.println(enabled);
		
		
	}
	else if (type.equalsIgnoreCase("displayed")) {
		boolean displayed = element.isDisplayed();
		System.out.println(displayed);
		
	}
	else if (type.equalsIgnoreCase("selected")) {
		boolean selected = element.isSelected();
		System.out.println(selected);
	
	}
	
	
}

public static void scroll(WebElement element) {
	JavascriptExecutor js=(JavascriptExecutor) driver;
	js.executeScript("arguments[0].scrollintoview();",element);
}
































}





		
		
		
		
		
		
		
		












			
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	

	
	



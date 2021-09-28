/*
 * package com.selenium.org;
 * 
 * public class A { package com.automation.pom;
 * 
 * import java.io.File; import java.io.IOException;
 * 
 * import org.apache.commons.io.FileUtils; import org.openqa.selenium.By; import
 * org.openqa.selenium.OutputType; import org.openqa.selenium.TakesScreenshot;
 * import org.openqa.selenium.WebDriver; import org.openqa.selenium.WebElement;
 * import org.openqa.selenium.chrome.ChromeDriver; import
 * org.openqa.selenium.interactions.Actions; import
 * org.openqa.selenium.interactions.ClickAction;
 * 
 * import com.project.base.Base_Class;
 * 
 * public class Purchase_Product extends Base_Class { public static WebDriver
 * driver; public static void main(String[] args) throws InterruptedException,
 * IOException { driver=getBrowser("chrome");
 * getUrl("http://automationpractice.com/index.php"); Homepage home = new
 * Homepage(driver); clickOnElement(home.getSign()); implicitWait(2); LoginPage
 * l = new LoginPage(driver); inputValueElement(l.getEmail(),
 * "hariharan123@gmail.com"); inputValueElement(l.getPsswrd(), "123456789");
 * clickOnElement(l.getSignin()); implicitWait(2); Thread.sleep(2000);
 * Pick_Dress dress = new Pick_Dress(driver); mouseOver(dress.getWomen(),
 * "move"); clickOnElement(dress.getSummer()); Thread.sleep(2000);
 * clickOnElement(dress.getSize()); clickOnElement(dress.getColor());
 * clickOnElement(dress.getStyles()); clickOnElement(dress.getCondition());
 * Thread.sleep(2000); mouseOver(dress.getImage(), "move");
 * mouseOver(dress.getQuickview(), "move");
 * clickOnElement(dress.getQuickview()); Thread.sleep(3000);
 * driver.switchTo().frame(0); selectTheElement(dress.getShape(), "value", "3");
 * Thread.sleep(2000); clickOnElement(dress.getColour());
 * clickOnElement(dress.getAddcart()); Thread.sleep(3000);
 * clickOnElement(dress.getProccedtocheckout()); Thread.sleep(2000); SignIn
 * signpage= new SignIn(driver); clickOnElement(signpage.getSign()); Address
 * proceedto = new Address(driver); clickOnElement(proceedto.getSignin());
 * Shipping ship=new Shipping(driver); clickOnElement(ship.getCheckBox());
 * clickOnElement(ship.getProceed()); Payment paycheck= new Payment(driver);
 * clickOnElement(paycheck.getPaycheck()); ConfirmOrder confirm= new
 * ConfirmOrder(driver); clickOnElement(confirm.getConfirm());
 * Thread.sleep(2000); Payment_Slip bill= new Payment_Slip(driver);
 * 
 * scrollup(bill.getLogo(), "view");
 * 
 * 
 * 
 * } }
 * 
 * 
 * 
 * }
 */

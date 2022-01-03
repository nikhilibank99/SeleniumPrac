package seleniumcodes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Nikhil {
	public static WebDriver driver;
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
	driver=new FirefoxDriver();
   driver.get("https://opensource-demo.orangehrmlive.com/");
	//driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
	driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	driver.findElement(By.id("txtPassword")).sendKeys("admin123");
	//driver.findElement(By.id("btnLogin")).click();
//	Actions act=new Actions(driver);
//	WebElement Maintenance=driver.findElement(By.xpath("//b[.='Maintenance']"));
//	Thread.sleep(4000);
////	act.moveToElement(Maintenance).build().perform();//mouse hover
////	act.contextClick(Maintenance).perform();//right click or context click
//	act.doubleClick(Maintenance).perform();//double click
//	Thread.sleep(4000);
////	act.clickAndHold(Maintenance).perform();
//	WebElement Maintenance1=driver.findElement(By.xpath("//b[.='Maintenance']"));
//	WebElement verifypwd=driver.findElement(By.xpath("//input[@name='confirm_password']"));
//	act.clickAndHold(Maintenance1).moveToElement(verifypwd).release(Maintenance1).build().perform();
//	

}
}

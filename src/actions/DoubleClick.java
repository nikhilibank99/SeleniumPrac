package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {

	public static WebDriver driver;
	public static void main(String[] args) {
	System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.get("https://seleniumpractise.blogspot.com/2016/09/complete-registration-form.html");
	Actions act=new Actions(driver);
	WebElement target= driver.findElement(By.xpath("//a[@class='profile-name-link g-profile']"));
	act.doubleClick(target).build().perform();
		

	}

}

package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class OpenLinkInNewTab {
	public static WebDriver driver;
	@Test
	public void click()
	{
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://seleniumpractise.blogspot.com/2016/09/complete-registration-form.html");
		WebElement target= driver.findElement(By.xpath("//a[@class='profile-name-link g-profile']"));
//		String selectLinkOpeninNewTab = Keys.chord(Keys.CONTROL,Keys.RETURN);
		String selectLinkOpeninNewTab = Keys.chord(Keys.CONTROL,Keys.ENTER);
		target.sendKeys(selectLinkOpeninNewTab);
}}

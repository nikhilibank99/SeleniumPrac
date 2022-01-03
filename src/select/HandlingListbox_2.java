package select;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class HandlingListbox_2 {
	public static WebDriver driver;
	@Test
	public void listb() {
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://seleniumpractise.blogspot.com/2016/09/complete-registration-form.html");
		WebElement listbox=driver.findElement(By.xpath("//select[@name='dropdown']"));
		Select sel=new Select(listbox);
//		sel.selectByIndex(1);
//		sel.selectByVisibleText("Physics");
//		sel.selectByValue("Physics");// only when option tag is there we can use this.
		sel.deselectByIndex(1);
}}

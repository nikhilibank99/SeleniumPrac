package select;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class HandlngListbox {
public static WebDriver driver;
@Test
public void listb() {
	System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
//	driver.get("https://seleniumpractise.blogspot.com/2016/09/complete-registration-form.html");
	driver.get("https://www.tutorialspoint.com/tutor_connect/index.php");
	WebElement listbox=driver.findElement(By.xpath("//select[@name='selType']"));
	Select sel=new Select(listbox);
//	sel.selectByIndex(1);
//	sel.selectByVisibleText("Physics");
	sel.selectByValue("name");// only when option tag is there we can use this.
//	sel.deselectByIndex(1);
}
}

package actions;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;

public class KeysForReFresh {
public static WebDriver driver;
	public static void main(String[] args) {
		System.setProperty("webdriver.ie.driver", "./drivers/IEDriverServer.exe");
		driver=new InternetExplorerDriver();
		driver.get("https://seleniumpractise.blogspot.com/2016/09/complete-registration-form.html");
		Actions act=new Actions(driver);
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		act.keyDown(Keys.CONTROL).sendKeys(Keys.F5).keyUp(Keys.CONTROL).build().perform();
		

	}

}

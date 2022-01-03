package seleniumcodes;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class VerifyCheckbox {
	public static WebDriver driver;
	@Test
	public void listb() {
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://seleniumpractise.blogspot.com/2016/09/complete-registration-form.html");
		List<WebElement> listcheckbox= driver.findElements(By.xpath("//input[@type='checkbox']"));
		System.out.println("size of checkbox list is "+listcheckbox.size());
		for(WebElement a:listcheckbox)
		{
			System.out.println(a.isSelected()+" Checkbox is not selected");
			a.click();
			System.out.println(a.isSelected()+" Checkbox is selected");
		}
		List<WebElement> listRadio= driver.findElements(By.xpath("//input[@type='radio']"));
		System.out.println("size of Radiobutton list is " +listRadio.size());
		for(WebElement rad:listRadio) {
			System.out.println(rad.isSelected()+" Radiobutton is not selected");
			rad.click();
			System.out.println(rad.isSelected()+" Radiobutton is selected");
		}
//		driver.close();
		
}
}
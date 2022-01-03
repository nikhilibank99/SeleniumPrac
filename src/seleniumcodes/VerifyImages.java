package seleniumcodes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class VerifyImages {
	public static WebDriver driver;
	@Test
	public void listb() {
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.google.com/");
		WebElement el=driver.findElement(By.xpath("//a[.='Images']"));
		boolean b=el.isDisplayed();
		System.out.println(b);
		String s=el.getText();//Images
		SoftAssert s1=new SoftAssert();
		s1.assertEquals(s, "Images");//pass
		driver.close();
		s1.assertAll();
		System.out.println("Images Verified successfully" +s);
//		___verifying google image____________________________
//		WebElement el1=driver.findElement(By.xpath("//img[@alt='Google']"));
//		System.out.println(el1.isDisplayed());
//		String s2=el1.getText();
//		driver.close();
//		System.out.println(s2);
		
}}

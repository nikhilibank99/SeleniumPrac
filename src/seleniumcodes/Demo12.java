package seleniumcodes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Demo12 {

//	@Test(priority=1)
//	@Test(enabled=false)
	@Test
	public void def() {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		System.out.println("Browser opened successfully for def");
		driver.manage().window().maximize();
		System.out.println("window maximised successfully for def");
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.close();
		
		
}
@Test(priority=1)
public void ghi() {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	System.out.println("Browser opened successfully for ghi");
	driver.manage().window().maximize();
	System.out.println("window maximised successfully for ghi");
	driver.get("https://opensource-demo.orangehrmlive.com/");
	driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	driver.findElement(By.id("txtPassword")).sendKeys("admin123");
	driver.findElement(By.id("btnLogin")).click();
	driver.close();
	
}
	

}



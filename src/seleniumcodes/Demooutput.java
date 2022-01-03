package seleniumcodes;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demooutput {
	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		System.out.println("Browser opened successfully");
		driver.manage().window().maximize();
		System.out.println("window maximised successfully");
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		Thread.sleep(5000);
		UtilityMultipleScreenshots.takeScreenshot(driver, "Username");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		Thread.sleep(5000);
		UtilityMultipleScreenshots.takeScreenshot(driver, "Password");
		

	
	
	}}

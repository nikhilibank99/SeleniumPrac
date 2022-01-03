package seleniumcodes;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class VerifyComboBox {

	public static WebDriver driver;
	@Test
	public void verifyCombobox() throws InterruptedException{
		//System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		driver=new ChromeDriver();
		driver.get("http://localhost:8100/");
			
		driver.findElement(By.xpath("//ion-label[text()='LOG IN']")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("c");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("c");
		driver.findElement(By.xpath("//ion-button[@id='btnSubmit']")).click();
		driver.manage().window().maximize();
		Thread.sleep(15000);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		WebElement Syncdata1=driver.findElement(By.xpath("//ion-label[.='Sync Data']"));
		jse.executeScript("arguments[0].click()", Syncdata1);
		WebElement Syncdata2=driver.findElement(By.xpath("//ion-button[text()='Sync Data']"));
		jse.executeScript("arguments[0].click()", Syncdata2);
		WebElement okaybtn=driver.findElement(By.xpath("//span[.='Okay']"));
		jse.executeScript("arguments[0].click()", okaybtn);
		Thread.sleep(5000);
		WebDriverWait wait1 = new WebDriverWait(driver, 30);
		WebElement element1 = wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//ion-tab-button[@id='tab-button-tni']")));
		element1.click();

		WebElement GroundInspection = wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Ground Inspection']")));
		GroundInspection.click();
		////ion-icon[@aria-label='add']
		WebElement AddNewLocation = driver.findElement(By.xpath("//span[text()='New Location']"));
		
		jse.executeScript("arguments[0].click()", AddNewLocation);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@placeholder='Enter Asset ID  here']")).sendKeys("RAAAAAR");
		Thread.sleep(5000);
		WebElement save=driver.findElement(By.xpath("//span[text()='Save']"));
		jse.executeScript("arguments[0].click()", save);
		WebElement clickAsset=driver.findElement(By.xpath("(//ion-label[@class='sc-ion-label-md-h sc-ion-label-md-s hydrated'])[18]"));
		jse.executeScript("arguments[0].click()", clickAsset);
		WebElement addnewLocation=driver.findElement(By.xpath("//ion-button[text()=' Add New Inspection ']"));
		jse.executeScript("arguments[0].click()", addnewLocation);
		WebElement header=driver.findElement(By.xpath("//span[text()='3 Months PMMS Ground Inspection']"));
		String head=header.getText();
		System.out.println(head);
		Assert.assertEquals(head,"3 Months PMMS Ground Inspection");
		System.out.println("header matches");
		
	}
}

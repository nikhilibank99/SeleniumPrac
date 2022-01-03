package seleniumcodes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderExample {
	@Test(dataProvider="testdata")
	public void m1(String uname, String pwrd)
	{
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		System.out.println("Browser opened successfully for ghi");
		driver.manage().window().maximize();
		System.out.println("window maximised successfully for ghi");
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.id("txtUsername")).sendKeys(uname);
		driver.findElement(By.id("txtPassword")).sendKeys(pwrd);
		driver.findElement(By.id("btnLogin")).click();

	}
	@DataProvider(name="testdata")
	public Object [][]data(){
		Object [][]obj=new Object[3][2];
		obj[0][0]="Admin";
		obj[0][1]="admin123";
		obj[1][0]="Nikhil";
		obj[1][1]="Singh";
		obj[2][0]="Preetish";
		obj[2][1]="Bhanjadeo";
		return obj;
		
	}
	
}

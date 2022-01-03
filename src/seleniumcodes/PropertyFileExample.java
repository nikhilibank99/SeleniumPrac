package seleniumcodes;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PropertyFileExample {
	public static WebDriver driver;
@Test
public void propertyFileCheck() throws IOException
{
	File f=new File("C:\\Users\\nikhil.singh\\eclipse-workspace\\SeleniumPrac\\Config_Property\\object.properties");
	FileInputStream fis=new FileInputStream(f);
	Properties pf=new Properties();
	pf.load(fis);
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	
	driver=new ChromeDriver();
	driver.get(pf.getProperty("URL"));
	driver.findElement(By.xpath(pf.getProperty("u_xpath"))).sendKeys(pf.getProperty("Username"));
	driver.findElement(By.xpath(pf.getProperty("p_xpath"))).sendKeys(pf.getProperty("Password"));
	driver.findElement(By.xpath(pf.getProperty("login_xpath"))).click();
	
	
	
}
}

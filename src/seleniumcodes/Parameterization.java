package seleniumcodes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterization {
@Test
@Parameters({"userid","passwd"})
public void m1(String username, String password) {
System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
WebDriver driver=new FirefoxDriver();
System.out.println("Browser opened successfully for ghi");
driver.manage().window().maximize();
System.out.println("window maximised successfully for ghi");
driver.get("https://opensource-demo.orangehrmlive.com/");
driver.findElement(By.id("txtUsername")).sendKeys(username);
driver.findElement(By.id("txtPassword")).sendKeys(password);
driver.findElement(By.id("btnLogin")).click();
driver.close();
}
}

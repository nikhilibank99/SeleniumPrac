package seleniumcodes;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class JavaScriptExecutorExample1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
//		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new FirefoxDriver();
		System.out.println("Browser opened successfully");
		driver.manage().window().maximize();
		System.out.println("window maximised successfully");
		//driver.get("https://opensource-demo.orangehrmlive.com/");
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.location='https://opensource-demo.orangehrmlive.com/'");
	//	Thread.sleep(5000);
		js.executeScript("document.getElementsByName('txtPassword').value='nikhil';");
	//	js.executeScript("(document.getElementsByTagName('input'))[6].value='nikhil';");
	}

}

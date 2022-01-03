package seleniumprac11;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Demo11 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
//		InternetExplorerDriver driver=new InternetExplorerDriver();
//		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
//		FirefoxDriver driver=new FirefoxDriver();
//		System.setProperty("webdriver.ie.driver", "./drivers/IEDriverServer.exe");
//		InternetExplorerDriver driver=new InternetExplorerDriver();
		System.out.println("Browser opened successfully");
		driver.manage().window().maximize();
		System.out.println("window maximised successfully");
//		driver.get("https://www.google.com");
//		driver.navigate().to("https://www.google.com");//navigate is a method and to is a method.
//		System.out.println("navigated to google page");
//		Thread.sleep(5000);
//		driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
		
		
//		driver.findElement(By.xpath("//button[.='NO THANKS']")).click();
//		Thread.sleep(5000);
//		System.out.println("navigated to javatpoint page");
//		driver.navigate().back();
//		System.out.println("navigated back to google page");
//		Thread.sleep(5000);
//		driver.navigate().forward();
//		Thread.sleep(5000);
//		System.out.println("again back to Javatpoint page");
//		driver.navigate().refresh();
//		Thread.sleep(5000);
//		System.out.println("page reloaded successfully");
//		driver.quit();
//		System.out.println("Browser closed successfully");
//		driver.findElement(By.id("m_login_email")).sendKeys("xyz");
//		driver.findElement(By.className("_54k8 _52jh _56bs _56b_ _28lf _9cow _56bw _56bu")).click();
//		driver.findElement(By.xpath("//button[@name='login']")).click();
//		driver.findElement(By.partialLinkText("GE Railroad Holding")).click();
//		driver.findElement(By.xpath("//button[contains(text(),'✕')]")).click();
//		driver.findElement(By.cssSelector("input[placeholder='Search for products, brands and more']")).click();
//		driver.findElement(By.cssSelector("input[name='q']")).click();
//		driver.findElement(By.className("_3704LK")).click();
//		List<WebElement> l= driver.findElements(By.tagName("div"));
//		System.out.println("number of links are " + l.size());
//		Thread.sleep(7000);
//		driver.findElement(By.xpath("//a[contains(text(),'Forgot your password?')]")).click();
//		driver.findElement(By.xpath("//a[text()='Forgot your password?']")).click();
//		driver.findElement(By.xpath("//a[starts-with(text(),'Forgot your password?')]")).click();
//		driver.findElement(By.xpath("//span[@class='form-hint'][.='Username']")).click();
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		WebDriverWait wait=new WebDriverWait(driver,10);
//		wait.until(ExpectedConditions.titleContains("Enter"));
//		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
//		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
//		driver.findElement(By.id("btnLogin")).click();
//		driver.findElement(By.id("menu_leave_viewLeaveModule")).click();
//		WebElement listbox=driver.findElement(By.id("leaveList_cmbSubunit"));
//		Select select=new Select(listbox);
//		select.selectByIndex(2);
//		driver.findElement(By.id("welcome")).click();
//		Thread.sleep(4000);
//		driver.findElement(By.xpath("//a[.='Logout']")).click();
//		WebElement d= driver.findElement(By.xpath("//span[.='My Timesheet']"));
//		d.click();
//		Actions act=new Actions(driver);
//		act.sendKeys(Keys.F5).build().perform();
//		System.out.println("love is the air");
//		act.contextClick(d).build().perform();//right click
//		act.doubleClick(d).build().perform();//double click
//		act.moveToElement(d).build().perform();
		
	}

}

package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		driver=new FirefoxDriver();
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		Thread.sleep(9000);
		WebElement xp=driver.findElement(By.xpath("(//iframe[@class='demo-frame lazyloaded'])[1]"));
		driver.switchTo().frame(xp);
		WebElement source=driver.findElement(By.xpath("//img[@src='images/high_tatras2_min.jpg']"));
		
		WebElement target=driver.findElement(By.xpath("//div[@id='trash']"));
		Actions act=new Actions(driver);
		act.dragAndDrop(source, target).build().perform();
	//	act.clickAndHold(source).moveToElement(target).release(source).build().perform();

	}

}

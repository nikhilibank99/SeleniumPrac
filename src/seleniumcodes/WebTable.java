package seleniumcodes;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			System.out.println("Browser opened successfully");
			driver.manage().window().maximize();
			System.out.println("window maximised successfully");
			
			driver.get("http://demo.guru99.com/test/web-table-element.php");
			List<WebElement> row=driver.findElements(By.xpath("/html/body/div/div[3]/div[1]/table/tbody/tr"));
//			System.out.println(row.size());
			for(int i=1;i<=row.size();i++) {//26
			List<WebElement> col=driver.findElements(By.xpath("/html/body/div/div[3]/div[1]/table/tbody/tr["+i+"]/td"));
//			System.out.println(col.size());
			for(int j=1;j<=col.size();j++)	{//5
				WebElement xp=driver.findElement(By.xpath("/html/body/div/div[3]/div[1]/table/tbody/tr["+i+"]/td["+j+"]"));
				System.out.print(xp.getText() + "  ");
				
			}
			System.out.println();
			}

	}

}

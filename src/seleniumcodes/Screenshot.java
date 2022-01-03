package seleniumcodes;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class Screenshot {

//	public static void main(String[] args) throws IOException {
	@Test(priority=2)
	public void abc() {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		System.out.println("Browser opened successfully for abc");
		driver.manage().window().maximize();
		System.out.println("window maximised successfully for abc");
		driver.get("http://demo.guru99.com/test/web-table-element.php");
//		TakesScreenshot t=(TakesScreenshot)driver;//typecasting WebDriver to TakesScreenshot type.
//		File srcFile=t.getScreenshotAs(OutputType.FILE);//to take screenshot and return in File Type and src is holding it.
//		File destFile=new File("C://Users/nikhil.singh/eclipse-workspace/SeleniumPrac/screenshot/nikhil.png");// creating file location
//		FileHandler.copy(srcFile,destFile);//copying screenshot file to destination path
		driver.close();
	}
	//}

}

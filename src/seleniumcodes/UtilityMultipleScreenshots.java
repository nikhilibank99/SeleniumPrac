package seleniumcodes;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class UtilityMultipleScreenshots {
public static void takeScreenshot(WebDriver driver,String filename) throws IOException {
//	DateFormat df=new SimpleDateFormat("dd_MMM_YYYY hh_mm_ss");
//	Date d=new Date();
//	String time=df.format(d);
	TakesScreenshot t=(TakesScreenshot)driver;//typecasting WebDriver to TakesScreenshot type.
	File srcFile=t.getScreenshotAs(OutputType.FILE);//to take screenshot and return in File Type and src is holding it.
	File destFile=new File("C://Users/nikhil.singh/eclipse-workspace/SeleniumPrac/screenshot/"+filename+".jpeg");// creating file location
	FileHandler.copy(srcFile,destFile);//copying screenshot file to destination path
	
	
	
}
}

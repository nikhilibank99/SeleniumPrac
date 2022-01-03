package excelutility;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class TestData {
public static void main(String[] args) throws IOException {
//to get access to the workbook	
	XSSFWorkbook wb=new XSSFWorkbook("C:\\Users\\nikhil.singh\\eclipse-workspace\\SeleniumPrac\\DataSheet\\LoginApp.xlsx");
//to get access to sheet inside workbook
//	XSSFSheet sh=wb.getSheetAt(0);//index
	XSSFSheet sh=wb.getSheet("Login");//Sheet name
//to get the number of row count in physical excel sheet
	int row=sh.getPhysicalNumberOfRows();//7
	System.out.println("row is : "+row);
//	sh.getLastRowNum();
	for(int i=0;i<row;i++) {
// to iterate through each row and get the column count
		int col=sh.getRow(i).getPhysicalNumberOfCells();
		System.out.println("column is : "+col);
		for(int j=0;j<col;j++)
		{
			//to iterate through each row & column both and get access to each cell
			XSSFCell cl=sh.getRow(i).getCell(j);
			System.out.print(cl +" ");
		}
	}
}
}

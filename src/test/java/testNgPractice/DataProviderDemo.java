package testNgPractice;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.commons.math3.linear.SingularMatrixException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataProviderDemo {
	
	
	@DataProvider(name = "loginTestData")
	public static String[][] loginDataFetch() throws EncryptedDocumentException, IOException{
		XSSFWorkbook	workbook = new XSSFWorkbook 
				(new FileInputStream("C:\\Users\\nitheshkumar.eshwaran@expleogroup.com\\Desktop\\TetsData.xlsx")); //get my workbook 
		XSSFSheet worksheet=workbook.getSheetAt(0);// get my sheet from workbook
		         //get my Row which start from
		
		
		int rows=worksheet.getLastRowNum()+1;
		int cols=worksheet.getRow(0).getLastCellNum();
		System.out.println("row: "+rows+" col "+cols);
		DataFormatter formator=new DataFormatter();
		
		 Cell cell;Row row;
		 String    data[][] = new String[rows - 1][cols];
		 for (int i = 1; i < rows; i++) {
             for (int j = 0; j < cols; j++) {
                 row = worksheet.getRow(i);
                 cell = row.getCell(j);
                 
                 data[i - 1][j] = formator.formatCellValue(cell);
//                 data[i - 1][j] =cell.getStringCellValue();
             }
         }
		
//		for (String[] $strings : data) {
//			for (String $colVal : $strings) {
//				System.out.println($colVal);
//			}
//		}
		return data;
				
		
	}
	
	@Test
	(dataProvider = "loginTestData")
	public void LoginTest(String userName,String pwd) throws EncryptedDocumentException, IOException {
		
		//String userName,String pwd
//		WebDriverManager.edgedriver().setup();
//		WebDriver driver = new EdgeDriver();
//		driver.manage().window().maximize();
//		driver.get("https://practicetestautomation.com/practice-test-login/");
//		driver.findElement(By.id("username")).sendKeys(userName);
//		driver.findElement(By.id("password")).sendKeys(pwd);
		loginDataFetch();
	
		
	}

}

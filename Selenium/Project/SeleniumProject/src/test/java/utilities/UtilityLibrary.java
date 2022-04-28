package utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.commons.collections4.map.HashedMap;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import basetest.BaseTest;

public class UtilityLibrary extends BaseTest{
	
	
	private static String[][]ExcelData;
	
	public static String[][] readExcel() throws IOException {
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"//src//test//resources//TestData.xlsx");
		XSSFWorkbook book = new XSSFWorkbook(fis);
		XSSFSheet sheet = book.getSheet("Data");
		int cellCount = sheet.getRow(0).getPhysicalNumberOfCells();
		int rowCount = sheet.getPhysicalNumberOfRows();
		try {
			ExcelData= new String[rowCount][cellCount];
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		for(int i=0;i<rowCount;i++) {
			
			
			for(int j=0;j<cellCount;j++) {
				ExcelData[i][j]=sheet.getRow(i).getCell(j).getStringCellValue();
				System.out.print(ExcelData[i][j]+"\t");
				
			}
			System.out.println("");
			
		}
		
		
		System.out.println(ExcelData.toString());
		book.close();
		fis.close();
		return ExcelData;
	}

}

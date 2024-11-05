package org.h2k.ecommerce.saucedemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class JavaUtility {

	//public static void main(String args[]) throws IOException
	public static String[][] readXLSX(String fileName,String sheetName)throws IOException
	{
		File f = new File(fileName);
		FileInputStream fis = new FileInputStream(f);
		//HSSF , XSSF
		//HSSF - xls
		//XSSF-xlsx
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet= wb.getSheet(sheetName);
		int rows = sheet.getPhysicalNumberOfRows();
		int cols = sheet.getRow(0).getPhysicalNumberOfCells();
		String arr[][]= new String[rows][cols];
		for(int i = 0 ; i < rows;i++)
		{
			for(int j=0;j<cols;j++)
			{
				XSSFCell cell = sheet.getRow(i).getCell(j);
				CellType ctype = cell.getCellType();
				switch(ctype)
				{
				case STRING:
					arr[i][j] = cell.getStringCellValue();
					System.out.println(arr[i][j]);
					break;
				case NUMERIC:
					arr[i][j] = cell.getNumericCellValue()+"";
					System.out.println(arr[i][j]);
					break;
				}
				//arr[i][j] = cell.getStringCellValue();
				//System.out.println(arr[i][j]);

			}
		}
		return arr;

	}

}

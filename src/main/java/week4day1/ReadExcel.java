package week4day1;

import java.io.IOException;


import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ReadExcel {

	public Object[][] readexcel() throws IOException {
		
		Object[][] data = null;

		//1.create folder in project and create new excel file
		
		XSSFWorkbook wBook=new XSSFWorkbook("./data/TC01.xlsx");

		//get num of sheets
		int numberOfSheets = wBook.getNumberOfSheets();
		System.out.println(numberOfSheets);
		//for (int k = 0; k < numberOfSheets; k++) {
			//2.go to patricular sheet in workbook by name of sheet or index
			//XSSFSheet sheet = wBook.getSheet("sheet1");
			XSSFSheet sheet = wBook.getSheetAt(0);
			//System.out.println(sheet.getSheetName());

			//3.get row count
			int rowNumCount = sheet.getLastRowNum();

			//get colunm count (cannot get col count directly so get header 1st (1st row),then get count of col
			//short lastCellNum = sheet.getRow(0).getLastCellNum();
			XSSFRow header = sheet.getRow(0);
			int colNumCount = header.getLastCellNum();

			data =new Object[rowNumCount][colNumCount];

			//iterate through row,col to get cell conent
			for (int i = 1; i <=rowNumCount; i++) {
				XSSFRow rows = sheet.getRow(i);
				for (int j = 0; j <colNumCount; j++) {
					XSSFCell cells = rows.getCell(j);
					String cellValue = cells.getStringCellValue();
					data[i-1][j]=cellValue;
					System.out.print(cellValue+" ");
				}
				System.out.println();
			}

		//}
		return data;


	}

}

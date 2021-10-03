package Com.UtilsLayer;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {
	// How to read data from excel sheet.
	public static FileInputStream fis;
	public static XSSFWorkbook workbook;
	public static File f;
	public static XSSFSheet sheets;

	public ExcelReader(String excelPath) {
		f = new File(excelPath);

		try {
			fis = new FileInputStream(f);
			workbook = new XSSFWorkbook(fis);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// Capture excel sheet data
	public String getData(int sheetIndex, int row, int column) {
		sheets = workbook.getSheetAt(sheetIndex);
		String data = sheets.getRow(row).getCell(column).getStringCellValue();
		return data;
	}

	// Count rows in excel sheet
	public int rowCount(int sheetIndex) {
		int rows = workbook.getSheetAt(sheetIndex).getLastRowNum();
		rows = rows + 1;
		return rows;
	}

	//Count Column in excel sheet
	public int ColumnCount(int sheetIndex)
	{
		int column=workbook.getSheetAt(sheetIndex).getRow(0).getLastCellNum();
		return column;
	}
	
		
}

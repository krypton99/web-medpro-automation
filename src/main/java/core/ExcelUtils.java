package core;
 
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;
import java.io.File;
 
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
 
public class ExcelUtils {
 
	public static String[][] getTableArray(String filePath, boolean isGetFirstRow, String sheetName) throws IOException {
		String[][] data = null;
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(new File(filePath));
			// chuyen du lieu sang kieu workbook - workbook cung cap cac phuong thuc de lam
			// viec voi excel
			Workbook workbook = new XSSFWorkbook(fis);
			// lay sheet dau tien trong excel
			Sheet sheet = workbook.getSheetAt(0);
			if(sheetName!=null && !sheetName.equals("")) {
				sheet = workbook.getSheet(sheetName);
			}
			Iterator<Row> rows = sheet.iterator();
			Row firstRow = rows.next();
			int numRows = sheet.getPhysicalNumberOfRows();
			int numCols = firstRow.getPhysicalNumberOfCells();
			
			
			int startRow = 0;
			data = new String[numRows][numCols];
			if (isGetFirstRow == false) {
				startRow = 1;
				data = new String[numRows - 1][numCols];
			}
			
			for (int r = startRow; r < numRows; r++) {
				Row row = sheet.getRow(r);
				for (int c = 0; c < numCols; c++) {
					Cell cell = row.getCell(c);
					if (startRow == 1) {
						data[r - 1][c] = getCellValueAsString(cell);
					} else
						data[r][c] = getCellValueAsString(cell);
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if(fis != null) 
				fis.close();
		}
 
		return data;
	}
	
	public static String[] getTableRow(String filePath, String sheetName, int rowIndex) throws IOException {
		String[] data = null;
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(new File(filePath));
			// chuyen du lieu sang kieu workbook - workbook cung cap cac phuong thuc de lam
			// viec voi excel
			Workbook workbook = new XSSFWorkbook(fis);
			// lay sheet dau tien trong excel
			Sheet sheet = workbook.getSheetAt(0);
			if(sheetName!=null && !sheetName.equals("")) {
				sheet = workbook.getSheet(sheetName);
			}
			
			Row row = sheet.getRow(rowIndex);
	
			int numCols = row.getPhysicalNumberOfCells();
			
			
		
			data = new String[numCols];
			
			
			for (int c = 0; c < numCols; c++) {
				Cell cell = row.getCell(c);
				data[c] = getCellValueAsString(cell);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if(fis != null) 
				fis.close();
		}
 
		return data;
	}
 
	private static String getCellValueAsString(Cell cell) {
		if (cell == null) {
			return "";
		}
		switch (cell.getCellType()) {
		case STRING:
			return cell.getStringCellValue();
		case NUMERIC:
			return String.valueOf(cell.getNumericCellValue());
		case BOOLEAN:
			return String.valueOf(cell.getBooleanCellValue());
		default:
			return "";
		}
	}
}

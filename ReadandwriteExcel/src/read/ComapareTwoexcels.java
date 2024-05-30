package read;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
 
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.tika.exception.TikaException;
import org.testng.Assert;
 
public class ComapareTwoexcels {
 
	/*
	 * http://makeseleniumeasy.com/2020/05/17/compare-two-excel-workbooks-using-apache-poi/
	This method compares if both excel files have same number of sheets and same
	name of sheets
	*/
	public void verifyIfExcelFilesHaveSameNumberAndNameOfSheets(Workbook workbook1, Workbook workbook2) {
		System.out.println("Verifying if both work books have same number of sheets.............");
		// Get total sheets count from first excel file
		int sheetsInWorkbook1 = workbook1.getNumberOfSheets();
		// Get total sheets count from second excel file
		int sheetsInWorkbook2 = workbook2.getNumberOfSheets();
		// Compare if both excel files have same number of sheets
		Assert.assertEquals(sheetsInWorkbook1, sheetsInWorkbook2,
				"Excel work books have different number of sheets. \n "
				+ "Sheets in work book 1 : "+sheetsInWorkbook1 +"\n "
						+ "Number of sheets in work book 2 : "+sheetsInWorkbook2);
		// Printing number of sheets in each work book
		System.out.println("Sheets in first work book : "+sheetsInWorkbook1);
		System.out.println("Sheets in second work book : "+sheetsInWorkbook2);
		System.out.println("Both work books have same number of sheets.........................");
		
		// Verify if sheets have same name in both workbooks
		// Sheets may not be in same order in both excel. So I am relaxing order of sheets condition.
		// Change i as required.
		System.out.println("Verifying if both work books have same name of sheets.............");
		List<String> sheetsNameOfWb1 = new ArrayList<>();
		List<String> sheetsNameOfWb2 = new ArrayList<>();
		// Since we have already verified that both work books have same number of sheets so iteration can be done against any workbook sheet count
		for (int i = 0; i < sheetsInWorkbook1; i++) {
			// Retrieving sheet names from both work books and adding to different lists
			sheetsNameOfWb1.add(workbook1.getSheetName(i));
			sheetsNameOfWb2.add(workbook2.getSheetName(i));
		}
		// Since I am relaxing same sequence of sheets. 
		Collections.sort(sheetsNameOfWb1);
		Collections.sort(sheetsNameOfWb2);
		Assert.assertEquals(sheetsNameOfWb1, sheetsNameOfWb2, "Provided excel work books have different name of sheets.");
		System.out.println("Sheet Names in first work book : "+sheetsNameOfWb1);
		System.out.println("Sheet Names in second work book : "+sheetsNameOfWb2);
		System.out.println("Both work books have same name of sheets.........................");
	}
 
	// This method compares if both excel files have same number of rows and corresponding columns
	public void verifySheetsInExcelFilesHaveSameRowsAndColumns(Workbook workbook1, Workbook workbook2) {
		System.out.println(
				"Verifying if both work books have same number of rows and columns in all sheets.............");
		int sheetCounts = workbook1.getNumberOfSheets();
		for (int i = 0; i < sheetCounts; i++) {
			Sheet s1 = workbook1.getSheetAt(i);
			Sheet s2 = workbook2.getSheetAt(i);
			int rowsInSheet1 = s1.getPhysicalNumberOfRows();
			int rowsInSheet2 = s2.getPhysicalNumberOfRows();
			Assert.assertEquals(rowsInSheet1, rowsInSheet2, "Sheets have different count of rows..");
 
			Iterator<Row> rowInSheet1 = s1.rowIterator();
			Iterator<Row> rowInSheet2 = s2.rowIterator();
			while (rowInSheet1.hasNext()) {
				int cellCounts1 = rowInSheet1.next().getPhysicalNumberOfCells();
				int cellCounts2 = rowInSheet2.next().getPhysicalNumberOfCells();
				Assert.assertEquals(cellCounts1, cellCounts2, "Sheets have different count of columns..");
			}
		}
	}
 
	@SuppressWarnings("deprecation")
	public static void verifyDataInExcelBookAllSheets(Workbook workbook1, Workbook workbook2) {
		System.out.println("Verifying if both work books have same data.............");
		// Since we have already verified that both work books have same number of sheets so iteration can be done against any workbook sheet count
		int sheetCounts = workbook1.getNumberOfSheets();
		// So we will iterate through sheet by sheet
		for (int i = 0; i < sheetCounts; i++) {
			// Get sheet at same index of both work books
			Sheet s1 = workbook1.getSheetAt(i);
			Sheet s2 = workbook2.getSheetAt(i);
			System.out.println("*********** Sheet Name : "+s1.getSheetName()+"*************");
			// Iterating through each row
			int rowCounts = s1.getPhysicalNumberOfRows();
			for (int j = 0; j < rowCounts; j++) {
				// Iterating through each cell
				int cellCounts = s1.getRow(j).getPhysicalNumberOfCells();
				for (int k = 0; k < cellCounts; k++) {
					// Getting individual cell
					Cell c1 = (Cell) s1.getRow(j).getCell(k).getRichStringCellValue();
					Cell c2 = s2.getRow(j).getCell(k);
					// Since cell have types and need o use different methods
					if(c1.getStringCellValue().equals(c2.getStringCellValue()))
						
						if(c1.getCellType()==(c2.getCellType()))
						 {
							String v1 = c1.getStringCellValue();
							String v2 = c2.getStringCellValue();
							Assert.assertEquals(v1, v2, "Cell values are different.....");
							System.out.println("Its matched : "+ v1 + " === "+ v2);
				 
							//c1.getRichStringCellValue()
							
						if (c1.getCellType()==Cell.CELL_TYPE_NUMERIC || c1.getCellType() == Cell.CELL_TYPE_FORMULA) {
							// If cell type is numeric, we need to check if data is of Date type
							if (DateUtil.isCellDateFormatted(c1) | DateUtil.isCellDateFormatted(c2)) {
								// Need to use DataFormatter to get data in given style otherwise it will come as time stamp
								DataFormatter df = new DataFormatter();
								String v11 = df.formatCellValue(c1);
								String v21 = df.formatCellValue(c2);
								Assert.assertEquals(v11, v21, "Cell values are different.....");
								System.out.println("Its matched : "+ v11 + " === "+ v21);
							} else {
								double v11 = c1.getNumericCellValue();
								double v21 = c2.getNumericCellValue();
								Assert.assertEquals(v11, v21, "Cell values are different.....");
								System.out.println("Its matched : "+ v11 + " === "+ v21);
							}
						}
						if (c1.getCellType() == Cell.CELL_TYPE_BOOLEAN) {
							boolean v11 = c1.getBooleanCellValue();
							boolean v21 = c2.getBooleanCellValue();
							Assert.assertEquals(v11, v21, "Cell values are different.....");
							System.out.println("Its matched : "+ v11 + " === "+ v21);
						}
					} else
					{
						// If cell types are not same, exit comparison  
						Assert.fail("Non matching cell type.");
					}
				}
			}
		}
		System.out.println("Hurray! Both work books have same data.");
	}
	
	public static void main(String[] args) throws IOException, TikaException {
		
       FileInputStream  filenew1 =new FileInputStream("C:\\Users\\girish\\Desktop\\EclipseJava\\ReadandwriteExcel\\Resources\\ActualFile.xlsx");
       XSSFWorkbook	workbook1 =new XSSFWorkbook(filenew1);
       
       FileInputStream  filenew2 =new FileInputStream("C:\\Users\\girish\\Desktop\\EclipseJava\\ReadandwriteExcel\\Resources\\OriginalFile.xlsx");
       XSSFWorkbook	workbook2 =new XSSFWorkbook(filenew2);
       
		workbook1=new XSSFWorkbook(filenew1);
		workbook2=new XSSFWorkbook(filenew2);
		
       verifyDataInExcelBookAllSheets(workbook1,workbook2);
		
	}
}
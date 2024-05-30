package company.com.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;
import java.util.Iterator;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.FormulaEvaluator;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFFormulaEvaluator;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.opencsv.CSVWriter;

public class FileUtil {
	
	public static void main(String...strings) throws IOException 
	{
		try {
			InputStream inputstream = new FileInputStream("");
			
		}catch(FileNotFoundException e)
		{
			
		}
	}

	
	public static void convertXlsxToCsv(InputStream inputStream) throws IOException
	{
		StringBuilder sb = new StringBuilder();
		FileWriter duplicate = new FileWriter("".concat(File.separator).concat("duplicateTestKeys.csv"));
		CSVWriter csv = new CSVWriter(duplicate);
		DataFormatter format = new DataFormatter();
		
		String[] list;
		
		
		try {
			XSSFWorkbook workbook = new XSSFWorkbook(inputStream);
			FormulaEvaluator fm = new XSSFFormulaEvaluator((XSSFWorkbook)workbook);
			
			XSSFSheet firstSheet = workbook.getSheetAt(1);
			Iterator<Row> iterator=firstSheet.iterator();
			BigDecimal bd;
			
			while(iterator.hasNext())
			{
				Row nextRow = iterator.next();
				int cellCount = nextRow.getPhysicalNumberOfCells();
				list = new String[cellCount];
				
				for (int i = 0; i < cellCount; i++) {
					
					Cell cellvalue = nextRow.getCell(i);
					fm.evaluate(cellvalue);
					String str = format.formatCellValue(cellvalue,fm);
					if(str.contains("-"))
					{
						
					}
					list[i]=format.formatCellValue(cellvalue,fm);
				}
				
				csv.writeNext(list);
				csv.flush();
				list=null;
			}
			
			csv.close();
		}catch(Exception e) {
			
		}
		
		
		
	}
}

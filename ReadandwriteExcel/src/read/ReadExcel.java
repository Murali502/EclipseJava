package read;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;

import org.apache.poi.hssf.usermodel.HSSFDateUtil;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.RichTextString;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {
	
	public FileInputStream filenew=null; 
	private XSSFWorkbook workbook=null;
	private XSSFSheet sheetName = null;
	private XSSFRow row = null;
	private XSSFCell cell = null;
	
	
    
	Map<String,Object> map=new HashMap();
	
/*public ReadExcel(String path)
{

	try {
		filenew= new FileInputStream(path);
		workbook=new XSSFWorkbook(filenew);
		workbook.getSheetAt(0);
		filenew.close();
		
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} 
	

}*/


public int getRowCount(String sheetname)
{
	
	int index=workbook.getSheetIndex(sheetname);
	
	if(index==-1)
	{
		return 0;
	}
	
	else
	{
		sheetName=workbook.getSheetAt(index);
		int number=sheetName.getLastRowNum()+1;
		return number;
	}
	
	
}
	
public String getCellData(String path, String colName, int rowNum) {

	
	try {
		
		filenew= new FileInputStream(path);
		workbook=new XSSFWorkbook(filenew);
		sheetName=workbook.getSheetAt(0);
		
		/*int index=workbook.getSheetIndex(sheetname);
		*/
		
		int number=sheetName.getLastRowNum()+1;
		if (rowNum <= 0)
			return "";

		int index = workbook.getSheetIndex(sheetName);
		int col_Num = -1;
		if (index == -1)
			return "";

		sheetName = workbook.getSheetAt(index);
		row = sheetName.getRow(0);
		for (int i = 0; i < row.getLastCellNum(); i++) {
			// System.out.println(row.getCell(i).getStringCellValue().trim());
			if (row.getCell(i).getStringCellValue().trim().equals(colName.trim()))
				col_Num = i;
		}
		if (col_Num == -1)
			return "";

		sheetName = workbook.getSheetAt(index);
		row = sheetName.getRow(rowNum - 1);
		if (row == null)
			return "";
		cell = row.getCell(col_Num);

		if (cell == null)
			return "";
		// System.out.println(cell.getCellType());
		if (cell.getCellType() == Cell.CELL_TYPE_STRING)
			return cell.getStringCellValue();
		else if (cell.getCellType() == Cell.CELL_TYPE_NUMERIC || cell.getCellType() == Cell.CELL_TYPE_FORMULA) {

			String cellText = String.valueOf(cell.getNumericCellValue());
			if (HSSFDateUtil.isCellDateFormatted(cell)) {
				// format in form of M/D/YY
				double d = cell.getNumericCellValue();

				Calendar cal = Calendar.getInstance();
				cal.setTime(HSSFDateUtil.getJavaDate(d));
				cellText = (String.valueOf(cal.get(Calendar.YEAR))).substring(2);
				cellText = cal.get(Calendar.DAY_OF_MONTH) + "/" + cal.get(Calendar.MONTH) + 1 + "/" + cellText;

				// System.out.println(cellText);

			}

			return cellText;
		} else if (cell.getCellType() == Cell.CELL_TYPE_BLANK)
			return "";
		else
			return String.valueOf(cell.getBooleanCellValue());

	} catch (Exception e) {

		e.printStackTrace();
		return "row " + rowNum + " or column " + colName + " does not exist in xls";
	}
}


	
	
public Map<String, Object> ReadData() throws IOException
{

	String path="C:\\Users\\girish\\Desktop\\Resources\\FreeCrmTestData.xlsx";
	try {
		filenew=new FileInputStream(path);
		workbook=new XSSFWorkbook(filenew);
		sheetName=workbook.getSheet("TableData");
		
		int rownumber=sheetName.getLastRowNum();
		
		 
		
		for(int i=0;i<=rownumber;i++)
		{
		  String TestcaseName=row.getCell(i).getStringCellValue().trim();
		  if(TestcaseName.trim().equals(""))
		  {
			  
			  
			  for(int j =0;j<=rownumber;j++)
			  {
				 Row initrow=sheetName.getRow(0);
				  String key=initrow.getCell(j).getStringCellValue();
					String values=row.getCell(j).getStringCellValue().trim();	  
					map.put(key, values);
			  }
		  }
		  
		}
		
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	return map;
	
}


/*public static boolean checkheader(Row row,String text)
{
	for(Cell cell:row)
	{
      if(cell.getStringCellValue().equals(text))		
      {
    	  
    	  return true;
      }
		
	}
*/	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String path="C:\\Users\\girish\\Desktop\\Resources\\FreeCrmTestData.xlsx";
		ReadExcel rd=new ReadExcel();
		
		rd.getCellData(path,"password",2);
		

	}

}






package read;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelDataTestcasewise {

	static FileInputStream filenew;
	static XSSFWorkbook workbook;
	static String TestcaseName="Login_Testcase";
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stu
		filenew =new FileInputStream("C:\\Users\\girish\\Desktop\\Resources\\FreeCrmTestData.xlsx");
		workbook =new XSSFWorkbook(filenew);
		XSSFSheet sheet=workbook.getSheet("TableData");
	    XSSFRow initrow=sheet.getRow(0); 
	    int rows=sheet.getLastRowNum()+1;
	    String key="";
	    String value1="";
	     for (int i = 1; i <rows; i++) {
	    	 
	    	 XSSFRow row=sheet.getRow(i);
	    	 
	    	 String value=sheet.getRow(i).getCell(0).toString();
	    	 if(value.equals(TestcaseName))
	    	 {
	    		 
	    		 for (int j = 0; j <row.getLastCellNum(); j++) {
	    		   value1=null;
					
	    		  if(initrow.getCell(j).getStringCellValue()==null)
	    		  {
	    			  key="";
	    		  }
	    		  else
	    		  {
	    			  key=initrow.getCell(j).getStringCellValue();
	    		  }
	    		  try {
	    			  
	    			  int datatype=row.getCell(j).getCellType();
	    			  
	    			  if(datatype==0)
	    			  {
	    				  value1=row.getCell(i).getStringCellValue();
	    			  }
	    			  if(datatype==1)
	    			  {
	    				  value1=row.getCell(i).getRawValue();
	    			  }
	    			  
	    			  value1=row.getCell(i).getStringCellValue();
	    			  
	    		  }
	    		  catch(Exception e)
	    		  {
	    			  value=null;
	    		  }
				}
	    	 }
			
		}
		
	}

}

package read;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.function.Predicate;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellValue;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {
	
	public ExcelUtils()
	{
		
	}

	private static String a(Workbook var0,Cell var1)
	{
		CellValue var2=var0.getCreationHelper().createFormulaEvaluator().evaluate(var1);
		String var3 = "no val found";
		if(var2==null)
		{
			var3="";
		}else {
			switch(var2.getCellType())
			{
			case 0:
				var3 = String.valueOf(var2.getNumberValue());
			break;
			case 1:
				var3 = String.valueOf(var2.getStringValue());
			case 2:
			case 3:
			case 5:
				default:
					break;
				case 4:
					var3 = String.valueOf(var2.getBooleanValue());
					
			}
		}
		
		return !var3.isEmpty() && var3 !=null ? var3.trim() :var3;
	}
	
	
	public static HashMap<String,String> getExcelRow(String var0,String var1,int var2)
	{
		HashMap var3 = new HashMap();
		try {
			
			File var9=new File(var0);
			FileInputStream var10 = new FileInputStream(var9);
			XSSFWorkbook var11;
			XSSFSheet var12 = null;
			Row var13;
			
		   short var4 = (var13=(var11=new XSSFWorkbook(var0)).getSheet(var1).getRow(var2)).getLastCellNum();
		   
		   for(int var5 =0;var5<var4; ++var5)
		   {
			   Cell var6=var12.getRow(0).getCell(var5);
			   String var14=a((Workbook)var11,(Cell)var6);
			   Cell var7 =var13.getCell(var5);
			   String var15 =a((Workbook)var11,(Cell)var6);
			   var3.put(var14, var15);
			   
		   }
		}catch(Exception e) {e.printStackTrace();}
		return null;
	}
	
	
	public static HashMap<String,String> getExcelRowFromWorkbook(Workbook var0,Sheet var1,int var2)
	{
		HashMap var3 = new HashMap();
		try {
			
			/*File var9=new File(var0);
			FileInputStream var10 = new FileInputStream(var9);
			XSSFWorkbook var11;
			XSSFSheet var12 = null;*/
			Row var9;
			
		   short var4 = (var9=var1.getRow(var2)).getLastCellNum();
		   
		   for(int var5 =0;var5<var4; ++var5)
		   {
			   Cell var6=var1.getRow(0).getCell(var5);
			   String var14=a(var0,var6);
			   Cell var7 =var9.getCell(var5);
			   String var15 =a(var0,var6);
			   var3.put(var14, var15);
		   }
		}catch(Exception e) {e.printStackTrace();}
		return null;
	}
	
	public static List<HashMap<String,String>> getAllRows(String var0,String var1)
	{
		ArrayList var2 = new ArrayList();
		try {
			
			File var7=new File(var0);
			FileInputStream var8 = new FileInputStream(var7);
			XSSFWorkbook var3;
			Sheet var10;	
			int var4 = (var10=(var3=new XSSFWorkbook(var8)).getSheet(var1)).getLastRowNum();
		 
		  for (int i = 1; i <=var4; i++) {
			HashMap var9 = getExcelRowFromWorkbook(var3,var10,i);
			var2.add(var9);
		}
			
		}catch(Exception e) {e.printStackTrace();}
		return var2;
	}
	
	public static List<HashMap<String,String>> allWithHeaders(String var0,String var1)
	{
		ArrayList var2 = new ArrayList();
		try {
			
			File var7=new File(var0);
			FileInputStream var8 = new FileInputStream(var7);
			XSSFWorkbook var3;
			Sheet var10;	
			int var4 = (var10=(var3=new XSSFWorkbook(var8)).getSheet(var1)).getLastRowNum();
		 
		  for (int i = 1; i <=var4; i++) {
			HashMap var9 = getExcelRowFromWorkbook(var3,var10,i);
			var2.add(var9);
		}
			
		}catch(Exception e) {e.printStackTrace();}
		return var2;
	}
	
	
	public static HashMap<String,List<HashMap<String,String>>> getWorkbook(String var0) throws IOException
	{
		HashMap var1 = new HashMap();
		XSSFWorkbook var2=null;
		
		try {
			
			File var13=new File(var0);
			FileInputStream var14 = new FileInputStream(var13);
			int var3 = (var2=new XSSFWorkbook(var14)).getNumberOfSheets();
		 
		  for (int var4 = 1; var4 <=var3; var4++) {
			  ArrayList var5 = new ArrayList();
			  Sheet var6;
			  int var7 =(var6=var2.getSheetAt(var4)).getLastRowNum();
			  
			  for (int var8 = 0; var8 <=var7; var8++) {
				HashMap var15 = getExcelRowFromWorkbook(var2,var6,var8);
				var5.add(var15);
			}
			  var1.put(var6.getSheetName(), var5);
		}
			
		}catch(Exception e) {e.printStackTrace();}
		finally { var2.close();}
		return var1;
	}
	
	public static int getRowIndex(List<HashMap<String,String>> var0,String var1,String var2)
	{
		for (int var3 = 0; var3 < var0.size(); var3++) {
			
			if(((String)((HashMap)var0.get(var3)).get(var1)).equalsIgnoreCase(var2))
			{
				return var3;
			}
			
		/*	if(((String)((HashMap)var0.get(var1)).equalsIgnoreCase(var2)) 
			{
				return var3;
				
			}*/
		}
			
		
		
		return -1;
	}
	
	public static HashMap<String, String> getRow(String var0,String var1,String var2,String var3)
	{
	
		/*Predicate<? super HashMap<String, String>> var2x;
		
		return (HashMap)getAllRows(var0,var1).stream().filter(var2x) -> { return ((String)var2x.)} */
	return null;
	}

	/*private static int a(XSSFRow var0,String var1)
	{
		int var2;
		for(var2 = 0; var0.cellIterator().hasNext() && !var0.getCell(var2))
		return null;
	}*/
	
	public synchronized void writeToExcel(String var1,String var2,int var3,String var4,String var5)
	{
		FileInputStream var6=null;
		XSSFWorkbook var7 =null;
		
		try {
			var6 =new FileInputStream(var1);
			File var13 = new File(var1);
			XSSFSheet var15;
			XSSFRow var8= (var15=(var7=new XSSFWorkbook(var6)).getSheet(var2)).getRow(0);
		//	var15.getRow(var3).getCell(cellnum)
			
			
		
		} catch(Exception var11) {System.out.println("write to excel failed"); var11.printStackTrace();}
		}
		

}

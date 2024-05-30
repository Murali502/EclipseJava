package logicalPrograms;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Readfile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		//Approach1 : using FileReader ,BufferedReader
		
		FileReader fr =new FileReader("");
		BufferedReader br =new BufferedReader(fr);
		
		String str;
		
		while((str= br.readLine())!=null)
		{
			System.out.println(str);
		}
		
		br.close();
	}

}

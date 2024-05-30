package company.com.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;

public class ReportSend {

	public static void main(String... args) {
		// TODO Auto-generated method stub

		Properties	prop = new Properties();
		try {
			 FileInputStream fis = new FileInputStream(new File(""));
			  prop.load(fis);
			  fis.close();
			  List<String> list = new ArrayList<String>();
			  
			  for(Entry<Object, Object> data : prop.entrySet()) {
				  list.add((String)data.getKey()+"_"+(String)data.getValue());
				  
				  
			  }
			 // list.forEach(System.out::printLn);
			
			  
		}catch(IOException e) {
			
		}
	}
	
	
	public static void sendMail(String sharepointURL,List<String> list, String issueLink) {
		
		//EmailSender emailsender = new EmailSender();
		List<String> headers = new ArrayList<String>();
		headers.add("Service Name");
		headers.add("Service Type");
		headers.add("Matched Record Count %");
		headers.add("UnMatched Record Count %");
		headers.add("Unique prod Record Count %");
		headers.add("Unique Test Record Count %");
		
				
		StringBuilder emailBody = new StringBuilder();
		emailBody.append("<html><body>");
		emailBody.append("<p>Hi Team, </p>");
		emailBody.append("<p>Please find the attachment. </p>");
		emailBody.append("<p>Thanks</p>");
		emailBody.append("<p>QA Team</p>");
		emailBody.append("<body></html>");
		
		String toList ="muraligolla@gmail.com";
		
		//try
		
		
		
		
		
	}
	

}

package company.com.common;

public class BaseClass {

	
	String fromMail = "no_reply@domain.com";
	String toMailList = "murali@domain.com";
	
	private static String buildEmailBody()
	{
		StringBuilder sb = new StringBuilder();
		sb.append("<html><body>");
		sb.append("<p>Hi Team, </p>");
		sb.append("<p>Please find the attachment. </p>");
		sb.append("<p>Thanks</p>");
		sb.append("<p>QA Team</p>");
		sb.append("<body></html>");
		return sb.toString();
		
	}
	
	public void sendReports()
	{
		
	}
	
}

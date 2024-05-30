package StringInterviewQuestions;

public class PrintObject {
	
	private String name;
	private int rollnumber;
	public PrintObject(String name, int rollnumber) {
		super();
		this.name = name;
		this.rollnumber = rollnumber;
	}
	
	@Override
	public String toString() {
		return "PrintObject [name=" + name + ", rollnumber=" + rollnumber + "]";
	}

	
	
}

package pojoNestedDemo;

public class Employee {

	private String fristName;
	private String LastName;
	private String Proffession;
	private Address address;
	
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	//private String fristName;
	public String getFristName() {
		return fristName;
	}
	public void setFristName(String fristName) {
		this.fristName = fristName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public String getProffession() {
		return Proffession;
	}
	public void setProffession(String proffession) {
		Proffession = proffession;
	}
	
}

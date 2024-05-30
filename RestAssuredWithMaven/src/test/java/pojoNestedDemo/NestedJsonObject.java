package pojoNestedDemo;

import io.restassured.RestAssured;

public class NestedJsonObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee employee = new Employee();
		employee.setFristName("Murali");
		employee.setLastName("Golla");
		employee.setProffession("Tester");
		
		Address address = new Address();
		address.setCity("BLR");
		address.setHouseNo(123);
		address.setCountry("India");
		address.setState("KA");
		address.setStreetName("Bagalur");
		
		employee.setAddress(address);
		
		
		RestAssured
		.given()
		.log()
		.all()
		.body(employee)
		.when()
		.get();
		
		
	}

}

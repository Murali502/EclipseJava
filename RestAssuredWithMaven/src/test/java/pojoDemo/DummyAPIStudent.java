package pojoDemo;

import io.restassured.RestAssured;

public class DummyAPIStudent {

	
	public static void main(String[] args) {
		
		Student st =new Student();
		st.setAccountNumber(12334);
		st.setAddress("BLR");
		st.setBalance(122.00);
		st.setFirstname("ABCCC");
		st.setLastname("XYZ");
		RestAssured
		.given()
		.log()
		.all()
		.body(st)
		.when()
		.get();
	}
}

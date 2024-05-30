package pojoDemo;

import java.util.ArrayList;
import java.util.List;

import io.restassured.RestAssured;

public class DummyAPIStudentJsonArray {

	
	public static void main(String[] args) {
		
		Student st =new Student();
		st.setAccountNumber(12334);
		st.setAddress("BLR");
		st.setBalance(122.00);
		st.setFirstname("ABCCC");
		st.setLastname("XYZ");
		
		Student st2 =new Student();
		st2.setAccountNumber(12334);
		st2.setAddress("BLR");
		st2.setBalance(122.00);
		st2.setFirstname("ABCCC");
		st2.setLastname("XYZ");
		
		List<Student> jsonArrayStudent = new ArrayList<>();
		jsonArrayStudent.add(st);
		jsonArrayStudent.add(st2);
		
		RestAssured
		.given()
		.log()
		.all()
		.body(jsonArrayStudent)
		.when()
		.get();
	}
}

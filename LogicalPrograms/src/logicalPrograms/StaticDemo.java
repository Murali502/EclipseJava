package logicalPrograms;

public class StaticDemo {

	static int i=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        i =9;
		Emp obj= new Emp();
		obj.eid=8;
		obj.salary=8000;
	//	obj.ceo="Mahesh";
		
		Emp rahul = new Emp();
		rahul.eid=9;
		rahul.salary=9000;
	//	rahul.ceo="Mahesh";
		
		
	}

}

class Emp
{

int eid;
 int salary;
 static String ceo;  
 
 static 
 {
	 ceo = "Lib";
 }
}

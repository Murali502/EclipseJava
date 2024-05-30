package oops;

public class Polymorphism extends Poly1{
	
	public void add(){
		System.out.println("sub class");
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//String name ="Book";
		String name ="Murali";
		String name1="Murali";
		String str=new String("Murali");
		Poly1 add=new Polymorphism();
		add.add();

	}

}

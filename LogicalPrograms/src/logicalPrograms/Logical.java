package logicalPrograms;

public class Logical {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Trainglewithusingtwoloops();
	}
	
	
	//Printing triangle without using two loops
   public static void Trainglewithusingtwoloops()
	{
		int row=1;
		int Counter=0;
		
		for (int i = 0; i <5;) {
			
			if(Counter<row)
			{
				System.out.print("A");
				Counter++;
				continue;
				
			}
			System.out.println("");
			Counter=0;
			row++;
			i++;
			
			if(row==i)
			{
				break;
			}
		}
		
		
		
	}

}

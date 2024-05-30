package logicalPrograms;

public class Logic2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		trianglewithoutusingtwoforloops();
	}

	private static void trianglewithoutusingtwoforloops()
	{
		int row=1;
		int counter=0;
		
		for(int i=0;i<5;)
		{
			if(counter<row)
			{
				System.out.print("A");
				counter++;
				continue;
			}
			
			System.out.println("");
			row++;
			i++;
			counter=0;
			if(row==i)
			{
				break;
			}
		}
		
	}
}

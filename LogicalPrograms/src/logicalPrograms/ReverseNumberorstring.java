package logicalPrograms;

public class ReverseNumberorstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		reversestring();
	}

	static void reversestring()
	{
		int [] num= {1,2,3,4,5};
	    String str="Murali";
	    char [] charray=str.toCharArray();
	   for (int i=charray.length-1; i>=0; i--) {
		
		  System.out.print(charray[i]);
	}
		
		
		/*for(int i=5;i>0;i--)
		{
			System.out.print(i);
		}*/
		
	}
}

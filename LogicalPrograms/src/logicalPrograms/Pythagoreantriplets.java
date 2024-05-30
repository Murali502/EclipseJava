package logicalPrograms;

public class Pythagoreantriplets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pythagorantripletslogic();
	}

	public static void Pythagorantripletslogic()
	{
		int a,b,c;
		int[] arr= {1,2,3,4,5,6,7,8,9,11,12,13};
		for (int i = 0; i < arr.length; i++) {
		 a=arr[i];
			for (int j = 0; j < arr.length; j++) {
				b=arr[j];
				for (int j2 = 0; j2 < arr.length; j2++) {
					c=arr[j2];
					if((a*a)+(b*b)==(c*c))
					{
						System.out.println(a+"     "+b+"    "+c);
					}
				}
			}
			
			
		}
	}
}

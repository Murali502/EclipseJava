package collections;

import java.util.Arrays;

public class DemoArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] ar = {1,20,30,40,0,4,0,0};
		int pos =0;
	    for (int i = 0; i < ar.length; i++) {
	    	
	    	if(ar[i]!=0)
	    	{
	    		ar[pos]=ar[i];
	    	    pos++;
	    	}
		}
	    System.out.println(Arrays.toString(ar));
	    //System.out.println(ar);
	    while(pos<ar.length) {
	         ar[pos] = 0;
	         pos++;
	      }
	    System.out.println("this is after placing zeros"+Arrays.toString(ar));
	}

	
	public static int[] demoArray(int [] arr)
	{
		int count = 0;
	    for (int i = 0; i < arr.length; i++) {
		
	    	if(i%2==0)
	    	{
	    		count++;
	    	}
	    	
		}
	    int arra[] = new int[count];
	    
	    
		return arr;
	}
}

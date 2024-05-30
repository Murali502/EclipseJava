package oops;

public class FinalDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 S obj =new S();
		 System.err.println(obj.i);
	}

}

final class S  // if don't want extend your class so we can create a final class, 
{
final int i;  //constant ----if you want make any variable 
public S()
{
 i=10;	
 
}

}

/*class x extends S
{
	
}*/
package overloadclass;

public class Signleton {

	private static Signleton t = new Signleton();
	
	private Signleton()
	{
		
	}
	
	
	public static Signleton getSingleton()
	{
		
		return t;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Runtime r =  Runtime.getRuntime();
		
	}

}

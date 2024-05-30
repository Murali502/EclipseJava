package overloadclass;

public class SingletonApproach3 {
	
	
	private static SingletonApproach3 t =null;
	
	private SingletonApproach3()
	{
		
	}

	
	public static SingletonApproach3 getobjet()
	{
		if (t==null)
		{
			t = new SingletonApproach3();
		}
		return t;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

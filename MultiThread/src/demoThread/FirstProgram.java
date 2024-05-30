package demoThread;

public class FirstProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyThread k =new MyThread();  //Thread Instantiation 
		k.start();  // Starting of a Thread and it always call the no arguments methods only 
		
		//k.run(); // difference between k.start and k.run is k.start will be created a new thread to execute the method. but in case of k.run a 
		//run method will be executed by main method as normal method 

		for (int i = 0; i < 10; i++) {
			System.out.println("Main thread");
		}
	}

}

package threadExample;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Mythread objthread = new Mythread();
		System.out.println("Main thread" + Thread.currentThread().getName());
		objthread.run();
		
		Thread.currentThread().setName("Murali");
		
		System.out.println(Thread.currentThread().getName()); 
	}

}

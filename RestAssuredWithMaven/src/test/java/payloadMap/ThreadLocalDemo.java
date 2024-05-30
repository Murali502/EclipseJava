package payloadMap;

public class ThreadLocalDemo {

	
	public static void main(String[] args) {
		
		ThreadLocal threadlocal = new ThreadLocal();
		threadlocal.set("Murali");
		
		System.out.println(threadlocal.get());
		
		threadlocal.remove();
		
		System.out.println(threadlocal.get());
		
		ThreadLocal threadlocal2 = ThreadLocal.withInitial(()-> "Mukesh");
		
		System.out.println(threadlocal2.get());
		
		
		ThreadLocal<String> threadlocal3 = new ThreadLocal();
		threadlocal3.set("Balaji");
		
		System.out.println(threadlocal3.get());
	}
}

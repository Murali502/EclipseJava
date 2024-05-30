package StringInterviewQuestions;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Randomnumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(Math.random());
		
		System.out.println(ThreadLocalRandom.current().nextInt());
		
		Random random = new Random();
		
		System.out.println(random.nextInt(1000));
		
		
		//random.nextInt(1000);
		
	}

}

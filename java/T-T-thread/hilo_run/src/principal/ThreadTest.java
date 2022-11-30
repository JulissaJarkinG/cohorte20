package principal;

import threads.Thread1;
import threads.Thread2;

public class ThreadTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread1 t1= new Thread1();
		Thread2 t2= new Thread2();
		
		t1.start();
		t2.start();
		try {
			t1. join();
			t2.join();
			

		} catch(InterruptedException e) {
			
		}
		System.out.println("Sean ejecutado los 2 thread");

	}

}

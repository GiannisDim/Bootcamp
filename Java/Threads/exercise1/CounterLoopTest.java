package exercise1;

public class CounterLoopTest {

	public static void main(String[] args) throws InterruptedException{
		
		long patience = 3000;
		
		System.out.println("Starting counterloop...");
		long starttime = System.currentTimeMillis();
		Thread t1 = new Thread(new CounterLoop(8));
		t1.start();
		
		while(t1.isAlive()){
			System.out.println("Still waiting...");
			System.out.println(patience - (System.currentTimeMillis() - starttime)+" ms to end!");
			t1.join(1000);
			if(((System.currentTimeMillis()- starttime) > patience) && t1.isAlive()){
				System.out.println("Tired of waiting!!");
				t1.interrupt();
				t1.join();
			}
		}
		
		System.out.println("Finally!");

	}

}

package exercise1;

public class CounterLoop implements Runnable {

	private int counter;

	public CounterLoop(int counter) {
		this.counter = counter;
	}

	public int getCounter() {
		return this.counter;
	}

	@Override
	public void run() {
		try {
			for (int i = 0; i < counter; i++) {
				System.out.println(i);
				Thread.sleep(2000);
			}
		} catch (InterruptedException e) {
			System.out.println("I'm interrupted.");
		}

	}

}

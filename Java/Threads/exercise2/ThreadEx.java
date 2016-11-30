package exercise2;

import java.util.Vector;

public class ThreadEx implements Runnable{

	private Vector vec;
	
	public ThreadEx(Vector vec){
		this.vec = vec;
	}
	
	@Override
	public void run() {
		long threadid = Thread.currentThread().getId();
		vec.add(threadid);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) throws InterruptedException{
		
		Vector vec = new Vector();
		ThreadEx threx = new ThreadEx(vec);
		
		Thread thr1 = new Thread(threx);
		Thread thr2 = new Thread(threx);
		Thread thr3 = new Thread(threx);
		thr1.start();
		thr2.start();
		thr3.start();
		thr1.join();
		thr2.join();
		thr3.join();
		System.out.println(vec.size());
		System.out.println(vec);
	}

	
}

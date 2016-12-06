package exercise1;

import java.util.Observable;
import java.util.Observer;

public class Student implements Observer {

	
	@Override
	public void update(Observable arg0, Object arg1) {
		System.out.println("I m a student and i m updated: "+arg1);
	}

}

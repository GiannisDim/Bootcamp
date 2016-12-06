package exercise1;

import java.util.Observable;
import java.util.Observer;

public class Instructor implements Observer {

	@Override
	public void update(Observable o, Object arg1){
		System.out.println("I m an instructor and i m updated: "+arg1);
	}
}

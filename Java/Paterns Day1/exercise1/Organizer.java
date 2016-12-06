package exercise1;

import java.util.Observable;
import java.util.Observer;

public class Organizer implements Observer {

	public void update(Observable o, Object arg1){
		System.out.println("I m an organizer and i m updated: "+arg1);
	}
}

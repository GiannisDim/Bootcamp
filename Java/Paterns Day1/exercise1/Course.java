package exercise1;


import java.util.Observable;

public class Course extends Observable {

	private String starttime;
	private String endtime;
	
	public Course(){
		
	}
	
	public Course(String starttime, String endtime){
		this.starttime = starttime;
		this.endtime = endtime;
	}
	
	public String getStartTime(){
		return starttime;
	}
	
	public void setStartTime(String starttime){
		this.starttime = starttime;
	}
	
	public String getEndTime(){
		return endtime;
	}
	
	public void setEndTime(String endtime){
		this.endtime = endtime;
	}
	
	public void changeTime(String starttime, String endtime ){
		setStartTime(starttime);
		setEndTime(endtime);
		String change = "New start time: "+starttime+" New end time: "+endtime;
		setChanged();
		notifyObservers(change);
	}
}

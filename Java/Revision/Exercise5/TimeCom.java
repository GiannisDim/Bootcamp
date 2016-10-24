package Exercise5;

public class TimeCom {
	
	private int hour;
	private int minute;
	private int second;
	
	public TimeCom(){
		
	}
	
	public TimeCom(int hour, int minute, int second){
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}

	//setters and getters
	public int getHour() {return hour;}
	public void setHour(int hour) {
		if(hour<=23 && hour>=0){
			this.hour = hour;
		}else{
			this.hour = 0;
		}
		
	}

	public int getMinute() {return minute;}
	public void setMinute(int minute) {
		if(minute>=0 && minute <=59){
			this.minute = minute;
		}else{
			this.minute = 0;
		}
		
	}

	public int getSecond() {return second;}
	public void setSecond(int second) {
		if(second>=0 && second<=59){
			this.second = second;
		}else{
			this.second = 0;
		}
		
	}
	
	//method toString
	public String toString(){
		return this.getHour()+":"+this.getMinute()+":"+this.getSecond();
	}
	
	//method setting the time
	public void setTime(int hour, int minute, int second){
		this.setHour(hour);
		this.setMinute(minute);
		this.setSecond(second);
	}
}

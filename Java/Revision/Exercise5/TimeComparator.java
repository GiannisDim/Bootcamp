package Exercise5;

import java.util.Comparator;

public class TimeComparator implements Comparator<TimeCom> {
	
	
	
	@Override
	public int compare(TimeCom time1, TimeCom time2) {
		
		if((time1.getHour() - time2.getHour()) != 0){
			return time1.getHour() - time2.getHour();
		}else{
			if((time1.getMinute() - time2.getMinute()) != 0){
				return time1.getMinute() - time2.getMinute();
			}else{
				return time1.getSecond() - time2.getSecond();
			}
		}
	}



	

	
		
}

package Exercise5;

public class TestTime {

	public static void main(String[] args) {
		
		TimeComparator a = new TimeComparator();
		TimeCom time1 = new TimeCom();
		TimeCom time2 = new TimeCom();
		time1.setTime(10, 10, 30);
		time2.setTime(10, 20, 10);
		
		int x = a.compare(time1, time2);
		if(x<0){
			System.out.println("Greater time is: "+time2.toString());
		}else{
			System.out.println("Greater time is: "+time1.toString());
		}

	}

}

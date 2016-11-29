package exercise3;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Exercise3 {
	
	public static void main(String[] args){
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		
		hm.put(1, "John");
		hm.put(2, "Alex");
		hm.put(3, "Dimitris");
		hm.put(4, "Nikos");
		
		HashMap<Integer, String> hm1 = new HashMap<Integer, String>();
		
		hm1.put(5, "Nikos");
		hm1.put(2, "John");
		hm1.put(7, "Evi");
		hm1.put(4, "Dimitris");
		
		Iterator<Map.Entry<Integer, String>> it = hm1.entrySet().iterator();
		while(it.hasNext()){
			Map.Entry<Integer, String> entry = it.next();
			Integer integer = entry.getKey();
			if(hm.containsKey(integer)){
				System.out.println(entry.getValue());
			}
		}
	}
}

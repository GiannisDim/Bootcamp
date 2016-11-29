package exercise2;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Exercise2 {
	
	public static void main(String[] args){
		Comparator<Integer> comparator = new IntegerComparator();
		PriorityQueue<Integer> queue = new PriorityQueue<Integer>(50, comparator);
		
		queue.offer(8);
		queue.offer(5);
		queue.offer(10);
		queue.offer(7);
		queue.offer(2);
		queue.offer(15);
		
		while (!queue.isEmpty()) {
		    Integer i = queue.poll();
		    System.out.println(i);
		}


	}
}

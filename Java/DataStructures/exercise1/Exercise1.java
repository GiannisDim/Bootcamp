package exercise1;

import java.util.ArrayList;
import java.util.List;

public class Exercise1 {

	public static <E> List<E> union(List<E> list1 , List<E> list2){
		List<E> list = new ArrayList<>();
		list.addAll(list2);
		list.addAll(list1);
		return list;
	}
	
	public static <E> List<E> intersection(List<E> list1, List<E> list2){
		List<E> list = new ArrayList<>();
		for(E d : list1){
			if(list2.contains(d)){
				list.add(d);
			}
		}
		
		return list;
	}
	
	public static void main(String[] args){
		List<Integer> list1 = new ArrayList<>();
		list1.add(5);
		list1.add(2);
		list1.add(0);
		list1.add(10);
		list1.add(7);
		List<Integer> list2 = new ArrayList<>();
		list2.add(1);
		list2.add(10);
		list2.add(5);
		list2.add(44);
		list2.add(61);
		list2.add(3);
		System.out.println(list1);
		System.out.println(list2);
		System.out.println(union(list1, list2));
		System.out.println(intersection(list1, list2));
		System.out.println(list1);
		System.out.println(list2);
		
	}
}

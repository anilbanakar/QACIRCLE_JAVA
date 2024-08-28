package Practice;

import java.util.ArrayList;

public class Arraylist1 {

	public static void main(String[] args) {
		
		ArrayList <Integer> list = new ArrayList <Integer> ();
		list.add(1);
		list.add(2);
		
		//how to remove duplicate elements from list
		//create one reference variale and store the original values and remove
		
		ArrayList<Integer> list2 = new  ArrayList <Integer> (list);
		list2.remove(1);
		
		list.removeAll(list2);
		System.out.println(list);
	
		
		//System.out.println(a.length);
		
	}

}

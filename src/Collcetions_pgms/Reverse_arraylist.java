package Collcetions_pgms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

public class Reverse_arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList al= new ArrayList<>();
		/*
		 * LinkedList LL = new LinkedList<>();
		 * 
		 * HashSet hs = new HashSet<>();
		 * 
		 * hs.add("a"); hs.add(1); hs.add(null);
		 * 
		 * HashMap hm = new HashMap<> ();
		 */
		
		al.add("6");
		al.add("5");
		
		System.out.println("size is : "+ al.size());
		
		Iterator i = al.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
			
		}
		
	   Iterator i2= al.iterator();
	   Collections.reverse(al);
	   
	   while(i2.hasNext())
	   {
		 System.out.println( i2.next());
	   }
	   
	   
		
	}

}

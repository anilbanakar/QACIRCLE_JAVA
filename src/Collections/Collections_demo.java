package Collections;

import java.util.ArrayList;

public class Collections_demo {

	public static void main(String[] args) {
		
		// collection will not allow primitive data type like below 
	  //	int a [] = new int [5];
			//a[0]=1;
			
		//types : List, Set, map
		//List types , ArrayList, Linked LIst
		
		ArrayList list = new ArrayList();
		
		// below are object type of data 
		list.add(1);
		list.add("abc");
		list.add(null); // allowed null value
		list.add('c');
	  //list.add('c'); // dupilcate allowed 
				
		
		System.out.println(list); // this will print group of objects / collection objects 
		//System.out.println(list.size());
		
		//System.out.println( list.get(0));	 // o/p 1	
		//list.remove(1);  // remove is used to remove specific object from collecion 
		//System.out.println(list); // abc is removed 
		
	   
		list.set(2,6); // inplace "null" adding "6" number
		System.out.println(list);
		
		ArrayList list2= new ArrayList();
		list2.add("10");
		list2.add("20");
		
		System.out.println(list.add(list2)); //it will append with first array objects
		System.out.println(list);  // o/p [1, abc, 6, c, [10, 20]] 
		
		//System.out.println(list.removeAll(list)); // all object are removed from collecion list and it will throw boolean result
		//list.clear(); // it will show empty list as-> []
		//System.out.println(list); 
		 list.removeAll(list);
		//System.out.println(list); // it will show empty list as-> []
	
		 // Contains method
		/*if(list.contains("abc"));
		{
		System.out.println("abc is present");	
		}
		else
		{
			System.out.println("abc is present");	
		}
		*/
		 list.replaceAll(list, "abc","xyz");
	}

}

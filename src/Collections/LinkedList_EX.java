package Collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
public class LinkedList_EX {

	public static void main(String[] args) {
		
		//LinkedList LL = new LinkedList() ; // THIS IS DEFAULT CONSTRUCOR
		LinkedList<String> list= new LinkedList<String>();
		
		list.add("apple");
		list.add("mango");
		list.add("orange");
		
		System.out.println(list); 
		
		// find one fruit
		
		ListIterator<String> itr= list.listIterator();
	    Boolean isbananaavailable= false;
	    while(itr.hasNext())
	    {
	    	String list1 = itr.next();
	    	if(list.equals(isbananaavailable))
	    	{
	    		isbananaavailable=true;
	        }
	    }	
	    if(isbananaavailable)
	    { 
	    	System.out.println("banana is availale"); 
	    }
	    else
	    {
	    	System.out.println("banana is not availale"); 
	    }
}	

}

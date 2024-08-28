package Collcetions_pgms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class ArrayList_descendingorder {

	public static void main(String[] args) {
       
		ArrayList al = new ArrayList();
		
		al.add("6");
		al.add("5");
		
	    System.out.println(al.size());
		
	    Iterator i = al.iterator();
	    while(i.hasNext())
	    {
	    	System.out.println(i.next());
	    }
	    
	    Comparator c= Collections.reverseOrder();
	    Collections.sort(al,c);
	    
	    
	    Iterator i2=al.iterator();
	    while(i2.hasNext())
	    {
	    	System.out.println( i2.next());
	    }
	    
	}

}

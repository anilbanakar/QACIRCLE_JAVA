package Collections;

import java.util.ArrayList;
import java.util.Iterator;

public class List_practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> al = new ArrayList<String>();
		al.add("apple");
		al.add("banana");
		
		//al.size();
		//al.set(2, "key");
		
		al.set(1, "k");
		System.out.println(al);
		
		
		Iterator<String> itr = al.iterator();
		Boolean status = false;
		while(itr.hasNext())
		{
		  String x=itr.next();
		  if(x.equals("status"))
		  {
			  status=true;
			  
		  }
		}
		  if(status)
		  {
			  System.out.println("banana is available ");
		  }
		  else
		  {
			  System.out.println("banana is not available");
		  }
		
			
		}
	}



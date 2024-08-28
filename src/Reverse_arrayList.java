import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

//import org.apache.commons.math3.util.MultidimensionalCounter.Iterator;

public class Reverse_arrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList al = new ArrayList();
		
		al.add("1");
		al.add("2");
		
		System.out.println(al.size());
		for(int i=0;i<al.size();i++)
		{
		 System.out.println( al.get(i));
		}
		
		Iterator i = al.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
			
		}
		Iterator i2 = al.iterator();
		Collections.reverse(al);
		
		while(i2.hasNext())
		{
			System.out.println(i2.next());
		}
		
	}

}

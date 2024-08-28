package Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class practice_ArrayList {

	String bookname; 
	int bookprice;
	String author;
	
	practice_ArrayList(String bookname,int bookprice, String author)
	{
		this.bookname=bookname;
		this.bookprice= bookprice;
		this.author=author;
	}
	
	
	@Override
	public String toString() {
		return "practice_ArrayList [bookname=" + bookname + ", bookprice=" + bookprice + ", author=" + author + "]";
	}


	public class practice_ArrayList1 {

	public static void main(String [] args)
	{
		practice_ArrayList Datascience = new practice_ArrayList("Datascience",100,"anil");
		practice_ArrayList java = new practice_ArrayList("java",150,"kumar");
		practice_ArrayList selenium = new practice_ArrayList("selenium",200, "ABC");
		
		
		ArrayList<practice_ArrayList> arraylistt = new ArrayList<practice_ArrayList>();
		arraylistt.add(java);
		arraylistt.add(java);
		arraylistt.add(selenium);
		
		
		System.out.println(arraylistt);  
		
		Iterator<practice_ArrayList> itr = arraylistt.iterator();
		
		
		ArrayList<practice_ArrayList>Javabooks = new ArrayList<practice_ArrayList>();
		
		while(itr.hasNext())
		{
		   practice_ArrayList book =itr.next();
		  if( book.bookname.equals(java));
		  {
			  Javabooks.add(book);
			  	
		  }
		}
		if(Javabooks.isEmpty())
		{
			System.out.println("java book not available");
		}
		else
		{
				double [] prices = new double[Javabooks.size()];
				for(int i=0;i<prices.length;i++)
				{
					prices[i] = Javabooks.get(i).bookprice;
				}
				
				Arrays.sort(prices);
		
		  for(practice_ArrayList book : Javabooks)
		  {
			  if(book.bookprice==prices[0])
			  {
				  System.out.println(book);
				  
			  }
		  }
		
		
		}
	}
	}
	

}

package Collections;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

   class Book
   {

	String bookname; 
	int bookprice;
	String author;
	
	Book(String bookname,int bookprice, String author)
	{
		this.bookname=bookname;
		this.bookprice= bookprice;
		this.author=author;
	}
	
	
	@Override
	public String toString() {
		return "practice_ArrayList [bookname=" + bookname + ", bookprice=" + bookprice + ", author=" + author + "]";
	}


	public class practice_ArrayList {

	public static void main(String [] args)
	{
		Book Datascience = new Book("Datascience",100,"anil");
		Book java = new Book("java",150,"kumar");
		Book selenium = new Book("selenium",200, "ABC");
		
		
		ArrayList<Book> arraylistt = new ArrayList<Book>();
		arraylistt.add(java);
		arraylistt.add(java);
		arraylistt.add(selenium);
		
		
		System.out.println(arraylistt);  
		
	Iterator<Book> itr=	arraylistt.iterator();
		
		
		ArrayList<practice_ArrayList>Javabooks = new ArrayList<practice_ArrayList>();
		
		while(itr.hasNext())
		{
		   Book book =itr.next();
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
					prices[i] = Javabooks.get(i)
				}
				
				
		
		  for(practice_ArrayList book : Javabooks)
		  {
			  if(book.bookprice==prices[0])
			  {
				  System.out.println(book);
				  
			  }
		  }
		
		
		}
	}}
	
}
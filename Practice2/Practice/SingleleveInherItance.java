package Practice;

class fruit
{
	String name;
	String color;
	 void Sweet()
	 {
		 System.out.println("sweet");
	 }

}
 class apple extends fruit
 {
	 double price;
	  void vitamin() {
	  System.out.println("provide vitamin a");
	}
 }

public class SingleleveInherItance {

	public static void main(String[] args) {
		
		apple ap = new apple();
		ap.Sweet();
		ap.vitamin();
		ap.color="red";
		ap.name="abc";
		ap.price=10;
	    System.out.println(ap.color);
        System.out.println(ap.name);	
        System.out.println(ap.price);
		
		
		

	}

}

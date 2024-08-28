package Variables;

public class Vriables_ex {

	static int a =10;
	//int b;
	
	  int studentid;
	
	static void display() // if this method is not static, then variable inside these method we can call from class directly
	{
		int b =15;
		System.out.println(b);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vriables_ex ex = new Vriables_ex();

		System.out.println(ex.studentid=20); // called the non static variable
		//ex.display(); // called the method
		display(); // since this method is static we can call directly // if its a non static we have to create an object   
		
		System.out.println(ex.a);  // static variable can access using object but viceversa not possible, non static methods/instance variable can't directlt
		
		System.out.println(ex.a); // this is possible because this is instance variable means created outside method within class
		//System.out.println(ex.b); // not possible these variables will call when method is executed and will destory once method ececution is completed 
		 
	    //=========================
		System.out.println(Vriables_ex.a); // static variable can call directly using class name
		//Vriables_ex.display();
		
		
		
       
		
	}
	

}

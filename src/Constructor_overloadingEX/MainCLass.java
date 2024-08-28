package Constructor_overloadingEX;

public class MainCLass {

	public static void main(String[] args) {
		
		Pen p = new Pen(); // default constructor will call
	
		//1st constrcutor members will call
		Pen p1 = new Pen("cello",10.0);  
		System.out.println(p1.brand);
		System.out.println(p1.price);
		
		//2nd constructor 
		Pen p2= new Pen("cello");
		System.out.println(p2.brand);

	}

}

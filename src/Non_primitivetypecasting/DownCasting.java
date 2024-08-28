package Non_primitivetypecasting;

public class DownCasting {

	public static void main(String[] args) {
	
		//upcasting
		Animal an = new Dog();
		an.name="dd";
		System.out.println(an.name);
		
		//Downcasting
		Dog d = (Dog) an;
		
		
		
		

	}

}

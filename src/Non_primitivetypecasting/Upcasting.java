package Non_primitivetypecasting;

public class Upcasting {

	public static void main(String[] args) {
	
		
		//Upcasting
		
		Animal animal = new Dog() ;
		animal.name="aa";
		//animal.nooflegs="4"; // this is not possible while upcasting
		
		
		//downcasting 
		
		//without upcasting downcasting is not possible
		Dog dog = (Dog) animal; //animal is a variable referenced for parent class in upcasting
		dog.name="abc";
		dog.nooflegs="4"; 
		System.out.println(dog.name);
		System.out.println(dog.nooflegs);
		
		
	}
	

}

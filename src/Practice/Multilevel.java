package Practice;

 class bird{
	 
	 void eat()
	 {
		 System.out.println("eAing");
	 }
 }

 class cat extends bird
 {
	 void eat1()
	 {
		 System.out.println("eAing1");
	 }
 }
 
 class babydog extends cat
 {
	 void eat3()
	 {
		 System.out.println("eating 3");
	 }
 }
public class Multilevel {

	public static void main(String[] args) {
		
		babydog bd = new babydog();
		bd.eat();
		bd.eat1();
		bd.eat3();
		
		cat c = new cat();
		c.eat();
		c.eat1();
		
		
	}

}

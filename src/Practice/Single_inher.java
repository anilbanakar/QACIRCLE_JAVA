package Practice;

 class Animal {
	
	void eat()
	{
		System.out.println("eating"); 
		
	}
}	
	class dog extends Animal
	{
		void eat1()
		{
			System.out.println("bow");
		}
	}


public class Single_inher{

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		dog d= new dog();
		d.eat();
		d.eat1();
	
	}

}

package compiletime_POLYMORPHISM;

public class methodoverloading {

	// compiletime polymorphism
	
	public static void main(String args[])
	{
		Swathi swathi = new Swathi();
		Unknown un = new Unknown();
		Friend friend = new Friend();
		swathi.speak(friend);
		swathi.speak(un);
		
	}
}

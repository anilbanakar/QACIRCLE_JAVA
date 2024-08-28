package compiletime_POLYMORPHISM;

public class Swathi {

	void speak(Unknown unknownperson) // Unknown is an object created in other class 
	{
		System.out.println(" swathi speak with unknow limitedly"); 
	}
	
	void speak(Friend friend)
	{
		System.out.println(" swathi speak with friend casually"); 
	}
	
}


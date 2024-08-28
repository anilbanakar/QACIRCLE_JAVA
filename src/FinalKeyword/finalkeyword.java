package FinalKeyword;

public class finalkeyword {
/*
 * Final: 
final is a keyword in java used to constant 
Once assigned any value to a variable, we can't change at the time of execution
as soon as you declare need to initialize 
   this is not possible
  	final int a; 
     a=20; // this is not allowed in java      

we an apply FINAL keyword to both variable & METHOD BUT we can't override that method   
if the method is final there should be an implemention, we can't change the implemention 
If any class is final we can't extend this class to child class    
we can overlod final methods but overridden is not possible 
Constructor can not be Final
   */
	
	final static int a=10;

	
	public static void main(String[] args) {
		 
	//finalkeyword.a=20; // since its final we can change the value 
		
		System.out.println(finalkeyword.a);//   o/p: 10
		

	}

}

package Operators_In_JAVA;

public class Ifelse_if_lader {

	
	public static void main(String[] args) {

		// Ifelse_if_lader -means we can write n number of if else statemet
		
		int marks =90; 
		
		if(marks>85)
		{
			System.out.println("qualifie with distiction");
		}
		else if(marks<=80 & marks>=60)  // use bitwise and so here it will execute both expression, we can use logical AND also
		{
			System.out.println("first class");
		}
		
		else if(marks >=35)
		{
			System.out.println("just passed");
		}
		else
		{
			System.out.println("fali"); 
		}
			
		
	}

}

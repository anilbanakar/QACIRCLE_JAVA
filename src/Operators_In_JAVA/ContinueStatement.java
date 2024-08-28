package Operators_In_JAVA;

public class ContinueStatement {

	public static void main(String[] args) {
	
		for(int i=0;i<=10;i++)
		{
		 if(i%2==0) //If this conition is true the continue statment it execute // 
			        //if condition is false continue statement will not execute, it will come out from the if loop and remaining statement of for loop will execute
		 {
			 continue; // means: what continue statement will do ? If this conition is true it will skip the current iteration and i value increased to 1
		 }
		 
		 System.out.println(i);
		}
	}

}

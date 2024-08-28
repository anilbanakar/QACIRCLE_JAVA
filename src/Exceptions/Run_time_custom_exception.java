package Exceptions;

import java.util.Arrays;

public class Run_time_custom_exception extends RuntimeException
{

	@Override
	public String toString() {
		return "Not eligible to vote";
		
				}
}

 class pollingBooth 
  {
	 void verify(int age)
        {
		 if(age<18)
		 {
			 Run_time_custom_exception run = 	new  Run_time_custom_exception();
			 throw run;
		 }
		 
		 }
	 
	 
	 public static void main(String [] args)
	 {
		 int age=10;
		 pollingBooth pb = new pollingBooth();
		 pb.verify(0);
		 
	 }
	 
 }

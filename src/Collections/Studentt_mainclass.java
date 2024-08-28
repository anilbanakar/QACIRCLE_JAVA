package Collections;

import java.util.ArrayList;
import java.util.Iterator;

 class Student{

	int studentid; 
	String studentname;
	String studentgrade;

       Student(int studentid,String studentname,String studentgrade ) // this is consructor 
       {
    	   this.studentid= studentid;
    	   this.studentname=studentname;
    	   this.studentgrade= studentgrade;
       }

	@Override  // if won't override to stringmethod the output will show in hexadecimal value
	public String toString() {  
		return "Student [studentid=" + studentid + ", studentname=" + studentname + ", studentgrade=" + studentgrade
				+ "]";
	}
 }

  public class Studentt_mainclass {

	public static void main(String[] args) {
		
		Student anil = new Student(1,"anil","A");
		Student kumar = new Student(2,"kumar","b");
		Student rahul = new Student(3,"rahul","b");
		
		ArrayList <Student> studentlist = new ArrayList<Student>();  //<Student> this is class created separately and 
		studentlist.add(anil);
		studentlist.add(kumar);
		studentlist.add(rahul);
	 
		 System.out.println(studentlist);
	 
		 // to print collections object one by one
		/* for( int i=0;i<studentlist.size();i++)
		 {
			System.out.println(studentlist.get(i));
		 }
		 */
		 
		 //to print collections object one by one in collecions we can use iteraor insead of for loop
		 // Iterator 
		 
		Iterator<Student> itr= studentlist.iterator();
		
	/*	while(itr.hasNext())
		{
			System.out.println(itr.next()); // this is to print all objects from collecions 
		}*/
		
		
		
		// this is to print student grade=A
		while (itr.hasNext())
		{
			Student student= itr.next();
			if(student.studentgrade.equals("A"))
			{
				System.out.println(student);
				System.out.println(student.studentname); // this will print student name with grade A  
			}
					
			
		}
		
		
		
		
	}
	
	

}

package Has_A_relationship;

public class Has_a_relationship {

	public static void main(String[] args) {
	
		/*has a relation is 2 types and both are same
		1.Aggration  :  EX:  library has a student  
		2.Composition : ex: library and book 
		
		//Aggration is week in relation ship
		 * Composition is strong in relationship
		 
		below ex is for Aggration
		*/
		
		//Student student = new Student();
		Library lb = new Library();
		lb.student=new Student();    // this is has a relationship
		
		lb.name="sharada";
		lb.location="bangalore";
		lb.student.studentname="anil";
		lb.student.studentid=1;
		
		System.out.println(lb.name);
		System.out.println(	lb.location);
		System.out.println(	lb.student.studentid);
		System.out.println(lb.student.studentname);
		
		
		
		
		
		
		

	}

}

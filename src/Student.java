
public class Student {

	// ObjectCreation_practice
	
	String studentid;
	String studentname;
	
	void student1()
	{
	 System.out.println(studentid+" "+studentname);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student stu = new Student();
		stu.studentid="123";
		stu.studentname="anil";
		
		stu.student1();
		
		
		

	}

}

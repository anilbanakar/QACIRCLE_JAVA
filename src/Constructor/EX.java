package Constructor;

public class EX {

	String studentname;
	int age;
	
	
	EX(String studentname,int age)
	{
		this.studentname=studentname;
		this.age=age;
	}
	public static void main(String[] args) {
		
		EX e = new EX("ABC", 1);
		System.out.println(e.studentname);
		System.out.println(e.age);
		
		

	}

}

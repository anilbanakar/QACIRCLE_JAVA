package Comparable;

import java.util.ArrayList;
import java.util.Collections;

public class Student implements Comparable<Student> {
	
	int id;
	String name;
	int age;
	
	Student(int id,String name,int age)
	{
		this.id=id;
		this.name=name;
		this.age=age;
		
	}
	

	public int compareTo(Student o) {
		
		if(id<o.id)
		{
			return -1;
		}
		else if(id>o.id)
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}
	public static void main(String[] args) {
		
		//Student std = new Student(age, name, age) ;
		
		ArrayList al = new ArrayList();
		al.add(new Student(10, "ANIL", 10));
				
		al.add(new Student(11, "kumar", 11));
			
		Collections.sort(al);
		for(Student x: o)
		{
			System.out.println();
		}
		
		

	}


	


}

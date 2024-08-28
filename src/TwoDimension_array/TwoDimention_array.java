package TwoDimension_array;

	class Student{
		String studentname;
		String id;
		String studentbranch;
		
		
		Student(String studentname,String id, String studentbranch )
		{
			this.studentname= studentname;
			this.id=id;
			this.studentbranch=studentbranch;
			
		}
		@Override   // this can be generate from source options (generate toString)
		public String toString() {
			return "Student [studentname=" + studentname + ", id=" + id + ", studentbranch=" + studentbranch + "]";
		}
		
	}
	public class TwoDimention_array {


		
		public static void main(String[] args) {
			
			Student rohit= new Student("rohit", "01","Cse");
			Student bhavya= new Student("bhavya","02","ISE");
			System.out.println(rohit.toString());
			System.out.println(bhavya.toString());
			
			Student[] student = new Student[2];
			student[0]=rohit;
			student[1]=bhavya;
			//student[2]=raj;
			//student[3]=som;
			
			
			boolean flag=false;
			for(int i=0;i<student.length;i++)
			{
			if(student[i].studentname.equals(bhavya))
				{
				System.out.println(student[i]); 
				flag=true;
				}
			}
			if(!flag) 
			{
				System.out.println("bhavya not present");
			}
		
		}

	}



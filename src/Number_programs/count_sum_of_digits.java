package Number_programs;

public class count_sum_of_digits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 int a=12344334;
		 int sum=0;
		 while(a>0)
		 {
			 int count = a%10;
			 sum=sum+count;
			 a=a/10;
		 }
		 System.out.println(sum);
	}

}

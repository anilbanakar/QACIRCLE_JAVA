package Array_pgms;

public class Remove_duplicate_chrater_inString {

	public static void main(String[] args) {
	String s= "aanill";
		
		char [] ch= s.toCharArray();
		StringBuilder sb= new StringBuilder();
		
		
		for (int i=0;i<ch.length;i++)
		{
			boolean repeated=false;
			
			for(int j=+1;j<ch.length;j++)
			{
				if(ch[i]==ch[j])
				{
					repeated= true;
					break;
				}
			}	
		
		if(!repeated) {      // this is not working properly need to check conditions 
			sb.append(ch[i]);
		}
		}

		System.out.println(sb);
	
	}


	}


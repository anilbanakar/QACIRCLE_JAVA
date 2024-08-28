package Constructor;

public class Def_con {
	
	String stdname;
	int stuid;

	Def_con(String stdname,int stuid)
	{
		this.stdname=stdname;
		this.stuid=stuid;
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Def_con dc = new Def_con("anil", 1);
		System.out.println(dc.stdname);
		//System.out.println(dc.stuid);
		

	}

}

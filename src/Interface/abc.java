package Interface;

public class abc implements pqr,xyz {

	int z=100;
	void m3()
	{
		System.out.println(z);
	}


	@Override
	public void m2() {
		System.out.println("this is m1 method");
		
	}

	@Override
	public void m1() {
		
		System.out.println("this is m2 method");
		
	}
}

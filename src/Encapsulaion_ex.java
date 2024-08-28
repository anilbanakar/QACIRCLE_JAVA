
public class Encapsulaion_ex {

	String name;
	String branch;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public static void main(String[] args) {

		Encapsulaion_ex ex= new Encapsulaion_ex();
		
		ex.setName("icici");
		ex.setBranch("123");
		System.out.println(ex.getBranch());
		System.out.println(ex.getName());

	}

}

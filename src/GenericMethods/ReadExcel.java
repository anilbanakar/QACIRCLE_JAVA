package GenericMethods;



public class ReadExcel {
	
	// in this class reused code from properties are used in this class also
	public static void main(String args[] )
	{
	Generic_methods gm = new Generic_methods();
	String propdata=gm.getdatafromproperties("TesData\\Test.properties", "url");
	System.out.println(propdata);
      

	}
}

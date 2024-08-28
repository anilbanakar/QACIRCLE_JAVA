package GenericMethods;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Generic_methods {
	
	public String getdatafromproperties(String path,String key)
	{
	FileInputStream fs= null;
	try {
		fs = new FileInputStream(path);
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
    
		Properties prop = new Properties();
		try {
			prop.load(fs);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		prop.getProperty(key);
		return key ;
		
		
  } 
}	




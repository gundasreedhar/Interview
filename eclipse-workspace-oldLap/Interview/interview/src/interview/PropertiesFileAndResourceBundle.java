package interview;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.ResourceBundle;

public class PropertiesFileAndResourceBundle {
	public static void main(String[] args) 
	{
		Properties prop = new Properties();
		FileInputStream fis;
		try {
			fis = new FileInputStream("C:\\Users\\Gunda Sreedhar\\git\\Interview\\interview\\resources\\app.properties");
			prop.load(fis);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
	  	System.out.println(prop);
		System.out.println(prop.getProperty("shreedhar"));
		prop.setProperty("srikanth", "sravani");
		System.out.println(prop);
		
		ResourceBundle resourceBundle = ResourceBundle.getBundle("app");
		System.out.println(resourceBundle.getString("srikanth"));
		System.out.println(resourceBundle.getString("srinivas"));
		
	}
}

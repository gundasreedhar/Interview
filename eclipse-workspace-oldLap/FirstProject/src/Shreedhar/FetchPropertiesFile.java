package Shreedhar;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

public class FetchPropertiesFile {
	public static void main(String[] args) throws IOException {
		//String path ="C:\Users\KABAB\Desktop\file";
		FileReader reader = new FileReader("C:\\Users\\KABAB\\Desktop\\file\\db.properties");
		Properties prop = new Properties();
		prop.load(reader);
		Set<String> keys = prop.stringPropertyNames();
		keys.forEach( k -> System.out.println(k + " "+ "--> " + prop.getProperty(k)));
		
	}

}

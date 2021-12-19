package Files;
import java.io.FileWriter;

import java.io.IOException;
/* 
 -------About FileWriter Class----- 
    * Allows file writer 
 * */
class FileWriterClass {
	public static void main(String[] args) throws IOException {
		
		// If we use this constructor then write() operation on this file will first clears previous 
		// data in file and writes the data into file from first
		String path = "C:\\Users\\KABAB\\Desktop\\file\\a.txt";
		FileWriter fw1 = new FileWriter(path);
		fw1.write("shreedhar");
		fw1.write("\n maithili");  //  \n is not considerd as a next line while writing onto file
 		fw1.flush();
		fw1.close();
 		
 		// Now upon using this constructor we can preserve previously present data and append the new data 
 		// into the file
 		FileWriter fw2 = new FileWriter(path,true);
 		fw2.write('\n');  //  \n is not considerd as a next line while writing onto file
 		fw2.write("yesss");
 		fw2.write('H');
 		// using write(String s , int start_index_of_s , int number_0f_characters)  
 		fw2.write("my name is ", 2,5);
 		fw2.flush();
 		fw2.close();
 		
 		
	}
}

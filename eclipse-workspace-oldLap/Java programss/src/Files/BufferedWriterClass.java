// This is BuffereWriter program 
// both FileWriter and BuffereWriter works the same but Buffered writer is efficient.
// File Writer to write the data onto the file makes several 100's times the System cals
// where as BuffereWriter takes only one system call by buffering together the data.
// so BuffereWriter is more Efficient
// One more difference is BufferedWriter has newLine() method which adds new line to the file. 
// since '\n' doesnt work

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

class BufferedWriterClass {
	public static void main(String[] args) throws IOException {

		// If we use this constructor then write() operation on this file will first
		// clears previous
		// data in file and writes the data into file from first
		String path = "C:\\Users\\KABAB\\Desktop\\file\\a.txt";
		FileWriter fw1 = new FileWriter(path);
		// BufferedWriter constructor needs the FileWriter object to be passed as an argument  
		BufferedWriter bw = new BufferedWriter(fw1);
		fw1.write("shreedhar");
		fw1.write("\n maithili"); // \n is not considerd as a next line while writing onto file
		fw1.flush();
		fw1.close();

		// Now upon using this constructor we can preserve previously present data and
		// append the new data
		// into the file
		FileWriter fw2 = new FileWriter(path, true);
		BufferedWriter bw2 = new BufferedWriter(fw2);
		fw2.write('\n'); // \n is not considerd as a next line while writing onto file
		fw2.write("yesss");
		fw2.write('H');
		// using write(String s , int start_index_of_s , int number_0f_characters)
		fw2.write("my name is ", 2, 5);
		fw2.flush();
		fw2.close();

	}
}
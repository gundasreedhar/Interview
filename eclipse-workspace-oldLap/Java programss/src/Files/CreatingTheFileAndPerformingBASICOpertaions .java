// creating the file and directory and performing BASIC opertaions 
/*
* To facilitate File read and write opertiaons java provides 6 classes
		   File 
		   FileWriter
		   BufferdFileWriter
		   PrintWriter
		   FileReader
		   BufferdFileReader
   
  -------About File Class----------
 * File class is used to get hold of locations and files and perform the Basic operations
 * The basic operations include:
 * 1. Create new file or directory.
 * 2. Delete the file or directtory.
 * 3. Check the permissions of file(readable, writable, executable)
 * 4. seting the permissions of file(readable, writable, executable)
 * 5. check weather the file or directory exists or not.
 * 6. Renaming the file.
 
 	Note:
 	 If u want to do above basic operations shown above u have to create the file first with path and its name 
 	 using that constructor and use ur req opertions as shown below.
 	 
 * To perform any operations mentioned above we use below syntax.
  		new File( path , "file name with extention").OPERATION_TO_PERFORMED();
  		for ex: creating the file,
 
 		--> new File( FileClass_Object , "file name with extention").creatFile();
 
*/



import java.io.File;
import java.io.IOException;

class First {
	public static void main(String[] args) throws IOException 
	{
		File f = new File("C:\\Users\\KABAB\\Desktop\\file");
		
		// Creating the file or the Directory if it doesn't Exists
		if (new File(f, "Despacito").exists())
			System.out.println("this file is already present");
		else 
		{
			System.out.print("this file is Not present so, the directory is created : ");
			System.out.println(new File(f, "Despacito").mkdir());
		}
		
		
		// To check weather the file created is the File or Directory  
		if(new File(f, "Despacito").isFile())
		{
			System.out.println("the file created is the File");
		}
		else if(new File(f, "Despacito").isDirectory())
		{
			System.out.println("the file created is the Directory");
		}
		
		// Listing the files in the directory
		new File(f, "aa.txt").createNewFile();
		new File(f, "bb.txt").createNewFile();
		new File(f, "cc.txt").createNewFile();
		String [] ar = f.list();
		System.out.println("The files in the directory -->" + f.getName() + "<-- are : ");

		for(String s : ar)
		{
			System.out.println(s);
		}
		
		// get the Parent name and get the the file name
		System.out.println();
		System.out.println();
		System.out.println("Parent name : " + f.getParent() + "\nChild or file name : " + f.getName());
		
		// Deleting the file aa.txt
		new File(f,"aa.txt").delete();
		
		// Renaming the file 
		System.out.println("Renaming the file bb.txt to macha.txt");
		new File(f,"bb.txt").renameTo(new File(f,"macha.txt"));
		
		
	}
}
package interview;

import java.io.IOException;

class Launchhh
{
	public static void main(String[] args ) throws IOException
	{
//		BufferedReader reader =
//				new BufferedReader(new FileReader("C:\\Users\\Gunda Sreedhar\\Desktop\\programs practice flow to start.txt"));
//		
//		List<String> lines = new ArrayList<String>();
//		String line = reader.readLine();
//		while(line!=null)
//		{
//			lines.add(line);
//			line = reader.readLine();
//		}
//		lines.stream().forEach(System.out::println);
		
//		Properties prop = new Properties();
//		prop.load(new FileInputStream("C:\\Users\\Gunda Sreedhar\\git\\Interview\\interview\\Resourse\\creadentials.properties"));
//		System.out.println(prop.get("shreedhar"));
//		
//		ResourceBundle rd = ResourceBundle.getBundle("creadentials	");
//		System.out.println(rd.getString("shreedhar"));
		
		
		// find second highest number 
		
//		int[] arr = {12,3,5,7,12,3};
//		int[] arr = { 2, 5, 25, 28, 1, 8, 26, 27, 28 };
//		int[] arr = { -1, -2, -3 };// {2,5,25,28,1,8,26,27,28};
//		int[] arr = { 3, 3, 3, 3, 0};
		int[] arr = { -1, -2, 1, 0 };
		int first = arr[0],second = arr[1];
		int temp = 0;
		
		
		for(int a : arr)
		{
			if(a > first)
			{
				temp = first;
				first = a;
				second = temp;
			}
			else if(a > second && a!= first)
				second = a;
				
		}
		
		System.out.println("first : " + first + "\nsecond : " + second);
	}
}


class Two_Dimention 
{
	public static void main(String[] args) 
	{
		int [][] arr = new int[][] {{1,2,3},{1,2,3,4},{1}};
//		int [][][] arr = new int[][][]{{{1,2,3,4},{1,2,3,4},{1,2,3,4},{1,2,3,4}},{{1,2,3,4},{1,2,3,4},{1,2,3,4},{1,2,3,4}},{{1,2,3,4},{1,2,3,4},{1,2,3,4},{1,2,3,4}},{{1,2,3,4},{1,2,3,4},{1,2,3,4},{1,2,3,4}}};
		for (int i = 0; i<arr.length ; i++)
		{	
			for (int j=0; j<arr[i].length ; j++ )
					System.out.print(arr[i][j]);
				System.out.println();
		}
	}
}

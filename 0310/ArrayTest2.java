
public class ArrayTest2 {

	public static void main(String[] args) {
		int sale[][] = new int[][] {{1,2,3,4},{5,6,7,8}};
		
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<4;j++)
			{
				System.out.println(sale[i][j]);
			}
		}
	}
}

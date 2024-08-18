
public class Leetcode_48_Rotate_Image
{
	public static void main(String[] args) 
	{
		int matrix[][] = {{5,1,9,11},{2,4,8,10},{13,3,6,7},{15,14,12,16}};
		
		rotate(matrix);		
	}
	
	public static void rotate(int[][] matrix)
	{
		int t=0,y=matrix[0].length;
		
		int a= y%2==0?y/2:y/2;
		
		for(int i=0;i<matrix[0].length;i++)
		{
			for(int j=i;j<matrix[0].length;j++)
			{
				t=matrix[j][i];
				matrix[j][i]=matrix[i][j];
				matrix[i][j]=t;	
			}
		}
		
		t=0;
		
		y-=1;
		
		for(int i=0;i<matrix[0].length;i++)
		{
			for(int j=0;j<matrix[0].length && y>=a;j++)
			{
				t=matrix[j][i];
				matrix[j][i]=matrix[j][y];
				matrix[j][y]=t;
			}
			y--;
		}
		
		for(int i=0;i<matrix[0].length;i++)
		{
			for(int j=0;j<matrix[0].length;j++)
			{
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
	}
}

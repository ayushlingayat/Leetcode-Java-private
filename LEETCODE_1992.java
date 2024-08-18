import java.util.ArrayList;

public class LEETCODE_1992 
{
	public static void main(String[] args) 
	{
		int land[][]= {{1,0,0},{0,1,1},{0,1,1}};
		
		int res[][]= findFarmland(land);
		
		for(int i=0;i<res.length;i++)
		{
			for(int j=0;j<res[0].length;j++)
			{
				System.out.print(res[i][j]+" ");
			}			
			System.out.println();
		}
	}
	
	public static int[][] findFarmland(int[][] land)
    {
        ArrayList<int[]> list= new ArrayList<>();

        int n=land.length;
        int m=land[0].length;

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(land[i][j] == 1)
                {
                    int arr[] = new int[4];

                    //store top left
                    arr[0]=i;
                    arr[1]=j;

                    int r=i;
                    int c=j;

                    //mark this group as visited
                    for(r=i;r<n && land[r][j]==1;r++)
                    {
                        for(c=j;c<m && land[r][c]==1;c++)
                        {
                            land[r][c]=2;
                        }
                    }

                    //store bottom right
                    arr[2]=r-1;
                    arr[3]=c-1;
                    list.add(arr);
                }
            }
        }   

        return list.toArray(int [][] :: new);
    }

}

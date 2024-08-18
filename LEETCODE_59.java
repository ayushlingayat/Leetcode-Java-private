
public class LEETCODE_59 
{
	public static void main(String[] args) 
	{
		int n=3;
		
		int res[][]= generateMatrix(n);
		
		for(int i=0;i<res.length;i++)
		{
			for(int j=0;j<res[0].length;j++)
			{
				System.out.print(res[i][j]+" ");
			}
			System.out.println();
		}		
	}
	
	public static int[][] generateMatrix(int n) 
    {
        int ans[][]=new int[n][n];

        int minr = 0, maxr = n-1;
        int minc = 0, maxc = n-1;

        int x=1;

        while(minr<=maxr && minc<=maxc)
        {
            //right
            for(int j=minc;j<=maxc;j++)
            {
                ans[minr][j]=x++;
            }

            minr++;

            if(minr>maxr || minc>maxc) break;

            //down
            for(int i=minr;i<=maxr;i++)
            {
                ans[i][maxc]=x++;
            }

            maxc--;

            if(minr>maxr || minc>maxc) break;

            //left
            for(int j=maxc;j>=minc;j--)
            {
                ans[maxr][j]=x++;
            }

            maxr--;

            if(minr>maxr || minc>maxc) break;

            //top
            for(int i=maxr;i>=minr;i--)
            {
                ans[i][minc]=x++;
            }

            minc++;

            if(minr>maxr || minc>maxc) break;
        }
        
        return ans;
    }
}

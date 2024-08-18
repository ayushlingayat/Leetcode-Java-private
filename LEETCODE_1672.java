
public class LEETCODE_1672
{
	public static void main(String[] args)
	{
		int accounts[][] = {{1,2,3},{3,2,1}};
		
		int res = maximumWealth(accounts);
		
		System.out.println(res);
	}
	
	public static int maximumWealth(int[][] a) 
    {
        int max=0,sum=0;
        
        for(int i=0;i<a.length;i++)
        {
        	sum=0;
        	for(int j=0;j<a[i].length;j++)
        	{
        		sum+=a[i][j];
        	}
        	max = Math.max(max,sum);
        }
        
        return max;
    }
}

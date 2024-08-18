
public class LEETCODE_53
{
	public static void main(String[] args) 
	{
		int n[] = {-2,-1};
		
		int res = maxSubArray(n);
		
//		int n =Integer.
		
		System.out.println(res);
	}
	
	public static int maxSubArray(int[] n) 
	{
		int currsum=n[0];
		int maxsum=n[0];
		
		for(int i=1;i<n.length;i++)
		{
			currsum = Math.max(n[i],currsum+n[i]);
			
			maxsum = Math.max(maxsum, currsum);
		}        
		
		return maxsum;
    }
}

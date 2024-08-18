
public class LEETCODE_485 
{
	public static void main(String[] args) 
	{
		int nums[] = {1,0,1,1,0,1};
		
		int res = findMaxConsecutiveOnes(nums);
		
		System.out.println(res);
	}
	
	public static int findMaxConsecutiveOnes(int[] a)
	{
		
		if(a.length==1 && a[0]==1) return 1;
		
		int c=0, max=0;
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==1)
			{
				c++;
			}
			
			else
			{
				c=0;
			}
			
			max=Math.max(max,c);
		}
        
		return max;
    }

}

import java.util.HashMap;

public class LEETCODE_930 
{
	public static void main(String[] args) 
	{
		int a[]= {1,0,1,0,1};
		
		int goal = 2;
		
		int res = numSubarraysWithSum1(a,goal);
		
		System.out.println(res);
	}
	
	// Method-1
	public static int numSubarraysWithSum(int[] a, int goal) 
    {
        return numSubarraysWithSumk(a,goal)-numSubarraysWithSumk(a,goal-1);
    }
	
	public static int numSubarraysWithSumk(int[] a, int k) 
    {
        int size =0,tail=0, sum=0;
        
        for(int head=0;head<a.length;head++)
        {
        	sum+=a[head];
        	
        	while(tail<=head && sum>k)
        	{
        		sum-=a[tail];
        		tail++;
        	}
        	
        	size+=(head-tail+1);
        }
        
        return size;
    }	
	
	// Method-2
	 public static int numSubarraysWithSum1(int[] a, int goal) 
	{
		HashMap<Integer,Integer> h=new HashMap<>();
		
		int sum=0,count=0;
		
		for(int i=0;i<a.length;i++)
		{
			sum+=a[i];
			
			if(sum==goal)
			{
				count++;
			}
			
			if(h.containsKey(sum-goal))
			{
				count+=h.get(sum-goal);
			}
			
			h.put(sum,h.getOrDefault(sum,0)+1);
		}	
		
		return count;
	}
}

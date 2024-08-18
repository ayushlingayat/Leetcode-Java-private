import java.util.HashMap;
import java.util.Map;

public class LEETCODE_2485 
{
	public static void main(String[] args) 
	{
		int n=1;
		
		int res = pivotInteger(n);
		
		System.out.println(res);
	}
	
	public static int pivotInteger(int n) 
    {
        int sum=n*(n+1)/2;
        int y = (int)Math.sqrt(sum);
        if(y*y==sum) return y;
        
		return -1;        
    }
	
	public static int pivot(int n)
	{
		Map<Integer,Integer> h=new HashMap<>();
		
		int sum=(n*(n+1))/2;
		
		
		for(int i=1;i<=n;i++)
		{
			sum-=(i-1);
			h.put(i,sum);
		}
		
		System.out.println(h);
		
		sum=0;
		for(int i=1;i<=n;i++)
		{
			sum+=i;
			if(h.containsValue(sum) && sum==h.get(i))
			{
				return i;
			}
		}
		
		return -1;
	}
}

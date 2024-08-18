import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class LEETCODE_3005 
{
	public static void main(String[] args)
	{
		int a[]= {1,2,2,3,1,4};
		
		int res = maxFrequencyElements1(a);
		
		System.out.println(res);
	}
	
	public static int maxFrequencyElements1(int[] a) 
	{
		Map<Integer,Integer> h1= new HashMap<>();
		
		for(int i=0;i<a.length;i++)
		{
			h1.put(a[i], h1.getOrDefault(a[i], 0)+1);
		}
		
		int sum=0,max=Integer.MIN_VALUE;
		
		for(Entry<Integer, Integer> x: h1.entrySet())
		{
			max=Math.max(max,x.getValue());
		}
		
		for(Entry<Integer, Integer> x: h1.entrySet())
		{
			if(h1.get(x.getKey())==max)
			{
				sum+=x.getValue();
			}
		}
		
		return sum;		
	}
	
	public static int maxFrequencyElements(int[] a) 
	{
		int max=Integer.MIN_VALUE;
		
		for(int i=0;i<a.length;i++)
		{
			max=Math.max(max,a[i]);
		}
		
		int freq[]= new int[max+1];
		
		for(int i=0;i<a.length;i++)
		{
			freq[a[i]]++;
		}
		
		max=0;
		int sum=0;
		
		for(int i=0;i<freq.length;i++)
		{
			max=Math.max(max,freq[i]);
		}
		
		for(int i=0;i<freq.length;i++)
		{
			if(freq[i]==max)
			{
				sum+=max;
			}
		}
		
		return sum;
	}
}

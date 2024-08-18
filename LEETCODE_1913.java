
public class LEETCODE_1913
{
	public static void main(String[] args) 
	{
		int a[] = {5,6,2,7,4};
		
		int res = maxProductDifference(a);
		
		System.out.println(res);
	}
	
	public static int maxProductDifference(int[] a) 
	{
		int min=Integer.MAX_VALUE;
		int smin=0;
		
		int max=Integer.MIN_VALUE;
		int smax=0;
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
			{
				smax=max;
				max=a[i];
			}
			
			else if(a[i]>smax)
			{
				smax=a[i];
			}
			
			if(a[i]<min)
			{
				smin=min;
				min=a[i];
			}
			
			else if(a[i]<smin)
			{
				smin=a[i];
			}
		}
		
		System.out.println(max+" "+smax);
		
		System.out.println(min+" "+smin);
		
		return (max*smax)-(min*smin);
	}
}

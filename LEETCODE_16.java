import java.util.Arrays;

public class q16_3sum_closest
{
	public static void main(String[] args)
	{
		int a[]= {-1,2,1,-4};
		
		System.out.println("closest sum: "+sum(a,1));

	}
	
	public static int sum(int a[],int target)
	{
		int add = 0;
		
		int j=0,k=0;
		
		Arrays.sort(a);
		
		int closest_sum=Integer.MAX_VALUE;
		
		for(int i=0;i<a.length-1;i++)
		{
			j=i+1;
			k=a.length-1;
			
			while(j<k)
			{
				add=a[i]+a[j]+a[k];
				
				if(Math.abs(target-add)<Math.abs(target-closest_sum))
				{
					closest_sum=add;
				}
				
				else if((a[i]+a[j]+a[k])>target)
				{
					k--;
				}
				
				else
				{
					j++;
				}
			}
		}
		
	return closest_sum;
		
	}

}

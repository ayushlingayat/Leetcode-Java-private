
public class q4_Median_of_Two_Sorted_Arrays_leetcode
{
	public static void main(String[] args) 
	{
		int a[]= {1,2};
		
		int b[]= {3,4};
		
		System.out.println("Median= "+findMedianSortedArrays(a,b));

	}
	
	public static double findMedianSortedArrays(int a[],int b[])
	{
		int c[]=new int[a.length+b.length];
		
		int i=0,j=0,k=0;
		
		while(i<a.length && j<b.length)
		{
			if(a[i]<b[j])
			{
				c[k++]=a[i++];
			}
			
			else
			{
				c[k++]=b[j++];
			}
		}
		
		while(i<a.length)
		{
			c[k++]=a[i++];
		}
		
		while(j<b.length)
		{
			c[k++]=b[j++];
		}
		
		for(int h:c)
		{
			System.out.print(h+" ");
		}
		
		if(c.length%2!=0)
		{
			return (double)(c[c.length/2]);
		}
		
		else
		{
			return (double)((c[(c.length-1)/2]+c[((c.length-1)/2)+1]))/2;
		}
	}

}

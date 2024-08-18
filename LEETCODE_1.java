import java.util.HashSet;

public class q1_Two_Sum_Leetcode 
{
	public static void main(String[] args)
	{
		int a[]= {2,7,11,15};

		int target=9;
		
		int b[]=two_sum(a,target);
		
		System.out.print("[");
		for(int i:b)
		{
			System.out.print(i+",");
		}
		System.out.print("]");
	
	}
	
	public static int[] two_sum(int a[],int t)
	{
		int c[] = new int[2];
		int d[] = new int[2]; 
		
		int j=0,k=0;
		
		HashSet<Integer> h=new HashSet<Integer>();
		
		for(int i=0;i<a.length;i++)
		{
			h.add(a[i]);
		}
		
		for(int i=0;i<a.length;i++)
		{
			if(h.contains(t-a[i]))
			{
				if(t-a[i]!=a[i])	
				{
					c[j++]=i;
				}
				
				else
				{
					d[k++]=i;
				}
			}
		}
		
		if(c[c.length-1]!=0)
		{
			return c;
		}
		
		else
		{
			return d;
		}
	}

}

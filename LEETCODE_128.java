import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class LEETCODE_128 
{
	public static void main(String[] args) 
	{
		int n[]= {100,4,200,1,3,2};
		
		for(int i:n)
		{
			System.out.print(i+", ");
		}
		
		int res = longestConsecutive(n);
		
		System.out.println("\n"+res);
	}
	
	public static int longestConsecutive(int[] n) 
	{
		HashSet<Integer> h = new HashSet<>();
		
		for(int i:n)
		{
			h.add(i);
		}
		
		int c=0,max=0;
		
		for(int i=0;i<n.length;i++)
		{
			c=0;
			if(!h.contains(n[i]-1))
			{
				int idx = n[i];
				
				while(h.contains(idx++))
				{
					c++;
				}
			}
			
			max = Math.max(max,c);
		}
		
		return max;
    }
}

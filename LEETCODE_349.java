import java.util.Arrays;
import java.util.HashSet;

public class LEETCODE_349 
{
	public static void main(String[] args) 
	{
		int a[] = {4,9,5};
		int b[] = {9,4,9,8,4};
		
		int res[] = intersection1(a,b);
		
		for(int i:res)
		{
			System.out.println(i);
		}
	}
	
	public static int[] intersection(int[] a, int[] b) 
	{
		Arrays.sort(a);
        Arrays.sort(b);
        
        HashSet<Integer> h=new HashSet<>();
        
        int i=0,j=0;

        while(i<a.length && j<b.length)
        {
            if(a[i]<b[j])
            {
                i++;
            }

            else if(a[i]>b[j])
            {
                j++;
            }

            else
            {
                h.add(a[i]);
                i++;
                j++;
            }
        }
        
        System.out.println(h);
        i=0;
        
        int c[]=new int[h.size()];
        
        for(int k:h)
        {
        	c[i++]=k;
        }
        
        return 	c;
	}
	
	public static int[] intersection1(int[] a, int[] b) 
	{
		HashSet<Integer> h=new HashSet<>();
		HashSet<Integer> h1=new HashSet<>();
		HashSet<Integer> h2=new HashSet<>();
		
		for(int i:a)
		{
			h.add(i);
		}
		
		for(int i:b)
		{
			h1.add(i);
		}		
		
		for(int i:h1)
		{
			if(h.contains(i))
			{
				h2.add(i);
			}
		}
		
		int c[]=new int[h2.size()];
		int j=0;
		
		for(int i:h2) c[j++]=i;
		
		return c;
	}
}

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class q15_3sum 
{
	public static void main(String[] args) 
	{
		int a[]= {-1,0,1,2,-1,-4};
		
		List<List<Integer>> b=new ArrayList<List<Integer>>();
		
		b=tri(a);
		
		System.out.println(b);
	}
	
	public static List<List<Integer>> tri(int a[])
	{
		Set<List<Integer>> s=new HashSet<List<Integer>>();
		
		Arrays.sort(a);
		
		int j=0,k=0;
		
		for(int i=0;i<a.length-2;i++)
		{
			j=i+1;
			k=a.length-1;
			
			while(j<k)
			{
				if((a[i]+a[j]+a[k])==0)
				{
					s.add(Arrays.asList(a[i],a[j++],a[k--]));
				}
				
				else if((a[i]+a[j]+a[k])>0)
				{
					k--;
				}
				
				else
				{
					j++;
				}
			}			
		}
		
		return new ArrayList<List<Integer>>(s);
	}

}

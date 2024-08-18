import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class LEETCODE_1207 
{
	public static boolean chk(int a[])
	{
		HashSet<Integer> h =new HashSet<>();
		
		for(int i=0;i<a.length;i++)
		{
			h.add(a[i]);
		}
		
		System.out.println(h);
		
		Map<Integer,Integer> h1=new HashMap<Integer,Integer>();
		
		for(int i=0;i<a.length;i++)
		{
			if(!h1.containsKey(a[i]))
			{
				h1.put(a[i],1);
			}
			
			else
			{
				h1.put(a[i],h1.get(a[i])+1);
			}
		}
		
		System.out.println(h1);
		
		h.clear();
		
		System.out.println(h);
		
		for(int i=0;i<a.length;i++)
		{
			h.add(h1.get(a[i]));
		}
		
		System.out.println(h);
		
		return h1.size()==h.size();
	}
	
	public static boolean chk1(int a[])
	{
		int b[] = new int[2001];
		
		HashSet<Integer> h=new HashSet<>();
		
		int max=Integer.MIN_VALUE;
		
		for(int i=0;i<a.length;i++)
		{
			max = Math.max(max,a[i]);
			
			b[a[i]+1000]++;
			h.add(a[i]);
		}
		
		int n=h.size();
		
		for(int i=0;i<=max;i++)
		{
			System.out.print(b[i]+" ");
		}
		
		System.out.println();
		
		h.clear();
		
		for(int i=0;i<2001;i++)
		{
			if(b[i]!=0)
			{
				h.add(b[i]);
			}
		}
		
		System.out.println(h);
		
		return n==h.size();
	}
	
	public static boolean chk2(int a[])
	{
		HashSet<Integer> h =new HashSet<>();
			
		Map<Integer,Integer> h1=new HashMap<Integer,Integer>();
		
		for(int i=0;i<a.length;i++)
		{
			if(!h1.containsKey(a[i]))
			{
				h1.put(a[i],1);
			}
			
			else
			{
				h1.put(a[i],h1.get(a[i])+1);
			}
		}
		
		System.out.println(h1);
				
		for(int i:h1.keySet())
		{
			if(h.contains(h1.get(i)))
			{
				return false;
			}
			
			h.add(h1.get(i));
		}
		
		return true;
	}
	
	public static boolean chk3(int a[])
	{
		Map<Integer,Integer> h1=new HashMap<Integer,Integer>();
		
		for(int i=0;i<a.length;i++)
		{
			h1.put(a[i], h1.getOrDefault(a[i],0)+1);
		}
		
		System.out.println(h1);
		
		HashSet<Integer> h =new HashSet<>(h1.values());
		
		System.out.println(h);
		
		return h.size()==h1.size();					
	}
	
	public static void main(String[] args) 
	{
		int arr[] = {1,2,2,1,1,3};
		
//		System.out.println(Math.abs(3));
		for(int i:arr)
		{
			System.out.print(i+" ");
		}
		
		System.out.println();
		
		boolean res = chk3(arr);
		
		System.out.println(res);
	}
}

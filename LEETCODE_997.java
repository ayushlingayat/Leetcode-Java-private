import java.util.HashMap;
import java.util.HashSet;

public class LEETCODE_997 
{
	public static void main(String[] args) 
	{
		int n = 2;
		int trust[][] = {};
			
			//{{1,3},{2,3},{3,1}};
			
			//{{1,3},{2,3}};
			
//			{{1,2}};
				
//				{{1,3},{1,4},{2,3},{2,4},{4,3}};
		
		int res = findJudge1(n,trust);
		
		System.out.println(res);		
	}
	
	public static int findJudge1(int n, int[][] trust) 
	{
		if(trust.length==0 && n==1) return n;

        else if(trust.length==0 && n>1) return -1;
		
		else if(trust.length==1) return trust[0][1]; 
				
		int a[]=new int[n+1];
		int b[]=new int[n+1];
		
		for(int p[]:trust)
		{
			a[p[0]]++;
			b[p[1]]++;
		}
		
		for(int i=1;i<b.length;i++)
		{
			if(b[i]==n-1 && a[i]==0)
			{
				return i;
			}
		}
		
		return -1;
	}
	
	public static int findJudge(int n, int[][] trust) 
	{
		if(trust.length==0 && n==1) return n;

        else if(trust.length==0 && n>1) return -1;
		
		else if(trust.length==1) return trust[0][1];
		
		HashSet<Integer> h=new HashSet<>();
		HashMap<Integer,Integer> h1=new HashMap<>();
		
		for(int i=0;i<trust.length;i++)
		{
			h.add(trust[i][0]);
			
			if(h1.containsKey(trust[i][1]))
			{
				h1.put(trust[i][1],h1.getOrDefault(trust[i][1],0)+1);
			}
			
			else
			{
				h1.put(trust[i][1],1);
			}
		}
		
		int t=0;
		
		for(int i=0;i<trust.length;i++)
		{
			if(h1.containsKey(trust[i][1]) && !h.contains(trust[i][1]))
			{
				t=h1.get(trust[i][1]);
				if(t==n-1)
					return trust[i][1];
			}
		}
		
		return -1;
    }
}

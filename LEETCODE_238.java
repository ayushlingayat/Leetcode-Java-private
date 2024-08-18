
public class LEETCODE_238
{
	public static void main(String[] args) 
	{
		int a[]= {-1,1,0,-3,3};
		
		int ans[] = res_main(a);
		
		for(int i:ans)
		{
			System.out.print(i+" ");
		}

	}
	
	public static int[] res_main(int a[])
	{
		int res[] = new int[a.length];		
		int prefix[] = new int[a.length];
		int suffix[] = new int[a.length];
		
		prefix[0]=1;
		suffix[a.length-1]=1;
		
		int pPrefix=1,pSuffix=1;
		
		for(int i=1;i<a.length;i++)
		{
			pPrefix*=a[i-1];
			prefix[i] = pPrefix;
		}
		
		for(int i:prefix)
		{
			System.out.print(i+" ");
		}
		
		System.out.println();
		
		for(int i=a.length-2;i>=0;i--)
		{
			pSuffix*=a[i+1];
			suffix[i] = pSuffix;
		}
		
		for(int i:suffix)
		{
			System.out.print(i+" ");
		}
		
		System.out.println();
		
		for(int i=0;i<a.length;i++)
		{
			res[i] = prefix[i]*suffix[i];
		}
		
		return res;		
	}
	
}

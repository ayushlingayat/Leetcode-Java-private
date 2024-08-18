import java.util.ArrayList;
import java.util.Collections;

public class LEETCODE_57 
{
	public static void main(String[] args) 
	{
		int a[][]= {{1,2},{3,5},{6,7},{8,10},{12,16}};
		
		int k[] = {4,8};
		
		int res[][] = insert(a,k);
		
		for(int i=0;i<res.length;i++)
		{
			for(int j=0;j<res[i].length;j++)
			{
				System.out.print(res[i][j]+" ");
			}
			
			System.out.println();
		}
	}
	
	public static int values(int a[][], int t1)
	{
		int max = 0;
		for(int i=0;i<a.length;i++)
		{
			if(t1>=a[i][0] && t1<=a[i][1])
			{
				return i;
			}
			
			else
			{
				max=i;
			}
		}
		
		return max-1;
	}
	
	public static int[][] insert1(int[][] a, int[] k)
	{
		int ans[][] = new int[a.length][2];
		
		int l= values(a,k[0]);
		int h= values(a,k[1]);
		
//		System.out.println(l+" "+h);
		ArrayList<int[]> ar = new ArrayList<>(); 
		
		if(a.length==0)
		{
			ar.add(k);
			return ar.toArray(new int[ar.size()][2]);
		}
				
//		for(int i=0;i<a.length;i++)
//		{
//			for(int j=0;j<a[i].length;j++)
//			{
//				if(i<l || i>h)
//				{
//					ans[i][j]=a[i][j];
//				}
//				
//				else
//				{
//					ans[l][0]=a[l][0];
//					if(a[h][1]>=k[1])
//					{
//						ans[l][1]=a[h][1];
//					}
//				}
//			}
//		}
		
		
		for(int i=0;i<a.length;i++)
		{
			if(i<l || i>h)
			{
				ar.add(a[i]);
			}
				
		}
		
		System.out.println(a[h][1]);
		

		if(a[l][0]<=k[0])
			{
				k[0]=a[l][0];
			}
			
			if(a[h][1]>=k[1])
			{
				k[1]=a[h][1];
			}
		
			ar.add(l, k);
		
//		for(int i=0;i<ans.length;i++)
//		{
//			if(ans[i][0]!=0)
//			{
//				ar.add(ans[i]);
//			}
//		}
		
		return ar.toArray(new int[ar.size()][2]);
    }
	
	public static int[][] insert(int[][] a, int[] b) 
    {
        ArrayList<int[]> res=new ArrayList<>();
        //store intervals before overlap
        int i=0;
        int n=a.length;

        while(i<n && a[i][1]<b[0])
        {
            res.add(a[i]);
            i++;
        }
       
        
        for(int p[]:res)
        {
        	for(int q:p)
        	{
        		System.out.print(q+" "); 
        	}
        	
        	System.out.println();
        }

        //merge overlapping intervals if any
        while(i<n && b[1]>=a[i][0])
        {
            b[0] = Math.min(b[0],a[i][0]);
            b[1] = Math.max(b[1],a[i][1]);
            i++;
        }
        res.add(b);

        //append the remaining intervals
        while(i<n)
        {
            res.add(a[i]);
            i++;
        }

        return res.toArray(new int[res.size()][2]);
    }
}

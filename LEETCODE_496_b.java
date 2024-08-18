import java.util.ArrayDeque;
import java.util.ArrayList;

public class q496_next_greater_element_I_b 
{
	public static void main(String[] args) 
	{
		int a[]= {1,3,4,2};
		
		int b[]= {4,1,2};
		
		int c[]=greater_element(a,b);
		
		for(int i=0;i<c.length;i++)
		{
			System.out.print(c[i]+" ");
		}

	}
	
	public static int[] greater_element(int a[],int b[])
	{
		ArrayDeque<Integer> q=new ArrayDeque<Integer>();
		ArrayList<Integer> l=new ArrayList<Integer>();
		int res[]=new int[b.length];
		int k=0;
		
		for(int i=0;i<b.length;i++)
		{
			q.add(b[i]);
		}
		
		for(int i=0;i<a.length;i++)
		{
			l.add(a[i]);
		}
		
		while(!q.isEmpty())
		{
			int t=q.remove();
			int p=l.indexOf(t);
			boolean flag=true;
			
			for(int j=p;p<l.size();j++)
			{
				if(l.get(j)>t)
				{
					res[k]=l.get(j);
					k++;
					flag=false;
					break;
				}
			}
			
			if(flag==true)
			{
				res[k++]=-1;
			}
		}
		
		return res;
	}

}

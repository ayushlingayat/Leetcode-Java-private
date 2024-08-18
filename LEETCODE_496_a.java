
public class q496_next_greater_element_I 
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
		int c[]=new int[b.length];
		
		int k=0,m=0;
		
		boolean flag=true;
		
		for(int i=0;i<b.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				if(b[i]==a[j])
				{
					m=j;
					for(int l=m+1;l<a.length;l++)
					{
						if(a[l]>b[i])
						{
							c[k++]=a[l];
							flag=false;
							break;
						}	
						
						if(b[i]==a[a.length-1])
						{
							c[k++]=-1;
						}
						
						else
						{
							c[k++]=-1;
						}
					}
				}
			}
		}
		
		
		
		return c;
	}

}

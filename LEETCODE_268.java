import java.util.HashMap;

public class q268_Missing_number 
{
	public static void main(String[] args)
	{
		int a[]= {0,1};
		
		System.out.println("Missing number= "+missing(a));
	}
	
	public static int missing(int a[])
	{
		HashMap<Integer,Integer> h=new HashMap<Integer,Integer>();
		
		for(int i=0;i<a.length;i++)
		{
			h.put(a[i],1);			
		}
				
		for(int i=0;i<=a.length;i++)
		{
			if(!h.containsKey(i))
			{
				return i;
			}
		}
		
		return -1;		
	}

}


public class q11_Container_With_Most_Water
{
	public static void main(String[] args) 
	{
		int a[]= {1,8,6,2,5,4,8,3,7};
		
		System.out.println("Water= "+RainWater2(a,a.length));
	}
			
	public static int RainWater2(int[] a, int size) 
	{
		int large=0;
		
		for(int i=0;i<size;i++)
		{
			for(int j=i+1;j<size;j++)
			{
				if(large<((j-i)*Math.min(a[i],a[j])))
				{
					large=(j-i)*Math.min(a[i],a[j]);
				}
			}
		}
		 
		return large;
	}
}

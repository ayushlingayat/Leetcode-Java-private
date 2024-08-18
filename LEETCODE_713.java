
public class LEETCODE_713
{
	public static void main(String[] args) 
	{
		int a[] = {10,2,5,10,6};
		int k=100;
		int res = numSubarrayProductLessThanK(a,k); 
		
		System.out.println(res);
	}
	
	public static int numSubarrayProductLessThanK(int[] a, int k) 
    {
		if(a.length<=1) return 0;
		
		int i=0,product=1,ans=0;
		
		for(int j=0;j<a.length;j++)
		{
			product *=a[j];
			
			while(i<=j && product>=k)
			{
				product/=a[i];
				i++;
			}
			
			if(product<k)
			{
				ans+=j-i+1;
			}
		}
		
		return ans;
    }
	
	public static int numSubarrayProductLessThanK1(int[] a, int k) 
    {
        int i=0,j=0,c=0,product=1;
		
		int size = a.length;
		
		while(j<size||i<size)
		{
			if(j==size)
			{
				i++;
				j=i;
				product=1;
			}
			
			if(i==size)
				break;

			
			product*=a[j];
			
			
			if(product<k)
			{
				c++;
				j++;
			}
			
			else
			{
				i++;
				j=i;
				product=1;
			}
		}
        
        return c;
    }
}


public class LEETCODE_258 
{
	public static void main(String[] args) 
	{
		int a=682373647;
		
		int res = addDigits(a);
		
		System.out.println(res);
	}
	
	public static int addDigits(int n)
	{
		int sum=0;
		
		while(n>0 || sum>9)
		{
			if(n==0)
			{
				n=sum;
				sum=0;
			}
			
			else
			{
				sum+=n%10;			
				n/=10;
			}
		}
		
		return sum;
    }
}

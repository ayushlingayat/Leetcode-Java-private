
public class LEETCODE_7 
{
	public static void main(String[] args) 
	{
//		int n=2147483647;
		
//		int n=-2147483648;
		
//		int n=1463847412;
		
//		int n=1534236469;
		
		int n=1563847412;
//		int n = -2147483412;
//		int n=1534236469;
		
		int res = reverse1(n);
		
		System.out.println(res);
	}
	
	public static int reverse(int n) {
		
		StringBuilder s=new StringBuilder(Integer.toString(Math.abs(n)));
        
        System.out.println(s);
		
		String s1 = s.reverse().toString();
		
		System.out.println(s1);
				
		if(n<0)
		{
			try
			{
				return -1*Integer.parseInt(s1);
			}
			
			catch(Exception e)
			{
				return 0;
			}		
			
		}
		
		else
		{
			try
			{
				return Integer.parseInt(s1);
			}
			
			catch(Exception e)
			{
				return 0;
			}		
		}
    }
	
	public static int reverse1(int n)
	{
		long rev=0;
		
		while(n!=0)
		{
			int rem = n%10;
			
			rev = rev*10+rem;
			
			n/=10;
		}
		
		if(rev<0)
		{
			if(rev<Integer.MIN_VALUE)
			{
				return 0;
			}
			
			return (int) rev;
		}
		
		else
		{
			if(rev>Integer.MAX_VALUE)
			{
				return 0;
			}
			
			return (int) rev;
		}
    }
}

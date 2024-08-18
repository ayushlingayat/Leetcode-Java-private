import java.util.Scanner;

public class Leetcode_172_Factorial_Trailing_Zeroes 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		
		int res= trailingZeroes(n);
		
		System.out.println(res);
	}
	
	public static int trailingZeroes(int n)
	{
		int c=0;
		
		for(int i=5;i<=n;i*=5)
			c+=(n/i);
		
		return c;
    }
}

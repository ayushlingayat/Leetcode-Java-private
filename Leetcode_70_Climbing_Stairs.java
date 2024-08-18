import java.util.Scanner;

public class Leetcode_70_Climbing_Stairs 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		int steps = sc.nextInt();
		
		int res= climbStairs(steps);
		
		System.out.println(res);
	}
	
	public static int climbStairs(int n)
	{
//		if(n<=0)
//			return 0;
//		
//		if(n==1 || n==2)
//			return n;
//		
//		else 
//			return climbStairs(n-1)+climbStairs(n-2);
		
		if(n==0)
			return 0;
		
		if(n==1 || n==2)
			return n;
		
		else
		{
			int str[] =new int[n+1];
			
			str[0]=0;
			str[1]=1;
			str[2]=2;
			
			for(int i=3;i<=n;i++)
			{
				str[i]=str[i-1]+str[i-2];
			}
			
			return str[n];
		}
	}
}

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class Leetcode_202_Happy_Number 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in); 
		
		int n=sc.nextInt();
		
		boolean res= isHappy(n);
		
		System.out.println(res);
	}
	
	public static boolean isHappy(int n) 
	{
		Stack<Integer> s=new Stack<Integer>();
		
		int t=check(n);
		
		while(t!=1)
		{
			if(s.contains(t))
				return false;
			
			else
				s.add(t);
			
			t=check(t);			
		}
		
		return true;
	}
	
	public static int check(int n)
	{
		int sum=0;
		
		while(n!=0)
		{
			sum+=Math.pow((n%10),2);
				
			n/=10;
		}
			
		return sum;				
	}
}

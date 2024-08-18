import java.util.Scanner;
import java.util.Stack;

public class Leetcode_191_Number_of_1_Bits 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		int n= sc.nextInt();
		
		int res= hammingWeight(n);
		
		System.out.println(res);
	}
	
	public static int hammingWeight(int n)
	{		
				
//		Stack<Integer> s=new Stack<Integer>();
//		
//		while(n>0)
//		{
//			if(n%10==1)
//				s.add(1);
//			
//			n/=10;
//		}
//		
//		return s.size();
		
		
//		int t[] = new int[Integer.toString(n).length()];
//		
//		int n1=n,i=0,c=0;
//		
//		while(n1>0)
//		{
//			t[i++]=n1%10;
//			
//			n1/=10;			
//		}
//		
//		for(int j:t)
//		{
//			if(j==1)
//				c++;
//		}
//		
//		return c;
		
		
//		int c=0;
//		
//		for(int i=0;i<32;i++)
//		{
//			if((n&1)==1)
//				c++;
//			
//			n=n>>1;
//		}
//		
//		return c;	
		
		
		int c=0;
		
		String s=Integer.toString(n);

		System.out.println(s);
		
		for(int i=0;i<s.length();i++)
		{
				if(s.charAt(i)=='1')
						c++;
		}

		return c;
	
	
	
	
	}
}

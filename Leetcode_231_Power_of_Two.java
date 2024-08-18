import java.util.Scanner;

public class Leetcode_231_Power_of_Two 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		
		boolean res= isPowerofTwo(n);
		
		System.out.println(res);
	}
	
	public static boolean isPowerofTwo(int n)
	{
		if(n>0)
		{
			double t= (Math.log(n)/Math.log(2));
			if((int)(Math.floor(t))==(int)(Math.round(t)))		
			{
				if(n==Math.pow(2,(int)(Math.floor(t))))
					return true;	
			}
			
			return false;
		}
		
		return false;
		
		
		
//		------------------------------------------------------------------------------
		
		
//		return n>0 && (n & n-1)==0;
		
		
		
//		------------------------------------------------------------------------------
		
		
		
//		 if(n==1)
//	            return true;
//
//	     if(n%2==0 && n>1)
//	     {
//	    	 int res=0;
//
//	         for(int i=1;i<=Integer.toBinaryString(n).length();i++)
//			 {
//	            res+=(n>>i)&1;
//	         }
//
//	         return res==1;
//	     }
//	     
//	     return false;		
		
		
//		------------------------------------------------------------------------------
	}
}

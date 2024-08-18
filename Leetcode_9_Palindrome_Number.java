import java.util.Scanner;

public class Leetcode_9_Palindrome_Number 
{
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		
		int x=sc.nextInt();
		
		boolean res= isPalindrome(x);
		
		System.out.println(res);
	}
	
	public static boolean isPalindrome(int x)
	{
		if(x>=0 && x<10)
			return true;
		
		else if(x<0)
			return false;
		
		else
		{
			boolean isPal=true;
			
			int num[] = new int[20];
			int num1[] = new int[20];
			int k=0,j=0,i=0;
			
			while(x>0)
			{
				num[k++]=(x%10);
				x/=10;
			}
			
			for(j=k-1;j>=0;j--)
				num1[i++]=num[j];
			
			for(int h=0;h<k;h++)
			{
				if(num[h]!=num1[h])
				{
					isPal= false;
					break;
				}					
			}
			
			if(isPal)
				return true;
			
			else
				return false;			
		}
		
	}

}

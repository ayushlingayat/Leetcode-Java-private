import java.util.Arrays;
import java.util.Scanner;

public class Leetcode_415_Add_Strings 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		String num1=sc.next();
		String num2=sc.next();
		
		String res=addStrings(num1,num2);
		
		System.out.println(res);
	}
	
	public static String addStrings(String num1, String num2)
	{
		char t[]= num1.toCharArray();
		char p[]= num2.toCharArray();
		
		String temp="",temp1="";
		int sum=0,carry=0;
		
		if(t.length==p.length)
		{
			for(int i=t.length-1;i>=0;i--)
			{
				sum+= (t[i]-48)+(p[i]-48)+carry;
				
				temp+=sum%10;
				carry = sum/10;
				sum=0;
			}		
			
			if(carry>0)
				temp+=carry;
		}
		
		else
		{
			if(t.length>p.length)
			{
				p=new char[t.length];
				
				Arrays.fill(p,'0');
				
				int y=num2.length()-1;
				
				for(int i=t.length-1;i>y && y>=0;i--)
				{
					p[i]=num2.charAt(y);
					y--;
				}
				
				for(char i:t)
					System.out.print(i+" ");
				
				System.out.println();
				
				for(char j:p)
					System.out.print(j+" ");
			}
			
			else
			{
				t=new char[p.length];
				
				Arrays.fill(t,'0');
				
				int y=num1.length()-1;
				
				for(int i=p.length-1;i>y && y>=0;i--)
				{
					t[i]=num1.charAt(y);
					y--;
				}
				
				for(char i:t)
					System.out.print(i+" ");
				
				System.out.println();
				
				for(char j:p)
					System.out.print(j+" ");
			}
			
			for(int i=t.length-1;i>=0;i--)
			{
				sum+= (t[i]-48)+(p[i]-48)+carry;
				
				temp+=sum%10;
				carry = sum/10;
				
				sum=0;
			}	
			
			if(carry>0)
				temp+=carry;
			
		}
		
		for(int i=temp.length()-1;i>=0;i--)
		{
			temp1+=temp.charAt(i);
		}
		
		return temp1;
	}
}

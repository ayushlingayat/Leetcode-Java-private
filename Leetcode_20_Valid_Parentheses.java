import java.util.Scanner;
import java.util.Stack;

public class Leetcode_20_Valid_Parentheses 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		
		String s= sc.next();
		
		boolean res= isValid(s);
		
		System.out.println(res);
	}
	
	public static boolean isValid(String s)
	{
		int c1=0,c2=0,c3=0;
		
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='(')
				c1++;
			
			else if(s.charAt(i)==')')
				c1++;
			
			else if(s.charAt(i)=='{')
				c2++;
			
			else if(s.charAt(i)=='}')
				c2++;
			
			else if(s.charAt(i)=='[')
				c3++;
			
			else if(s.charAt(i)==']')
				c3++;
		}
		
		Stack<Character> s1=new Stack<Character>();
		
		if(s.length()%2==0 && c1%2==0 && c2%2==0 && c3%2==0)
		{
			for(int i=0;i<s.length();i++)
			{
				if(s.charAt(i)=='(' || s.charAt(i) == '{' || s.charAt(i)=='[')
					s1.push(s.charAt(i));
				
				else if(s.charAt(i)==')')
				{
					if(s1.size()>0)
					{
						if(s1.peek() != '(')
							return false;
						
						else
							s1.pop();
					}
					
					else
						return false;
				}
				
				else if(s.charAt(i) == '}')
				{
					if(s1.size()>0)
					{
						if(s1.peek() != '{')
							return false;
						
						else
							s1.pop();
					}
					
					else
						return false;
				}
				
				else if(s.charAt(i)==']')
				{
					if(s1.size()>0)
					{
						if(s1.peek() != '[')
							return false;
						
						else
							s1.pop();
					}
					
					else
						return false;
				}
			}
			
			System.out.println(s1);
			
			if(s1.isEmpty())
				return true;
			
			else
				return false;
		}
		
		else
		{
			return false;
		}
	}
}

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Leetcode_13_Roman_To_Integer 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		String s=sc.next();
		
		int res= romanToInt(s);
		
		System.out.println(res);
	}
	
	public static int romanToInt(String s)
	{
		int n=0;
		
		HashMap<Character,Integer> h=new HashMap<Character,Integer>();
		
		h.put('I',1);
		h.put('V',5);
		h.put('X',10);
		h.put('L',50);
		h.put('C',100);
		h.put('D',500);
		h.put('M',1000);
		
		for(int i=0;i<s.length();i++)
		{
			if(i<s.length()-1)
			{
				if((s.charAt(i+1)=='V' || s.charAt(i+1)=='X') && s.charAt(i)=='I')
				{
					n+=(-1);
				}
				
				else if(s.charAt(i)=='X' && (s.charAt(i+1)=='L' || s.charAt(i+1)=='C'))
				{
					n+=(-10);
				}
				
				else if(s.charAt(i)=='C' && (s.charAt(i+1)=='D' || s.charAt(i+1)=='M'))
				{
					n+=(-100);
				}
				
				else
				{
					n+=h.get(s.charAt(i));
				}
			}
			
			else
			{
				n+=h.get(s.charAt(i));
			}
		}		
		
		return n;
	}

}

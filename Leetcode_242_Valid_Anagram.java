import java.util.HashMap;
import java.util.Scanner;

public class Leetcode_242_Valid_Anagram 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		
		String s=sc.next();
		
		String t=sc.next();
		
		boolean res= isAnagram(s,t);
		
		System.out.println(res);		
	}
	
	public static boolean isAnagram(String s, String t)
	{	
		if(s.length()==t.length())
		{
			Integer temp=0;

			HashMap<Character,Integer> h1=new HashMap<Character,Integer>();
			
			HashMap<Character,Integer> h2=new HashMap<Character,Integer>();
			
			for(int i=0;i<s.length();i++)
			{
				if(h1.containsKey(s.charAt(i)))
					h1.put(s.charAt(i),h1.get(s.charAt(i))+1);
				
				else
					h1.put(s.charAt(i),1);
			}
			
			for(int i=0;i<t.length();i++)
			{
				if(h2.containsKey(t.charAt(i)))
					h2.put(t.charAt(i),h2.get(t.charAt(i))+1);
				
				else
					h2.put(t.charAt(i),1);
			}
			
			for(int i=0;i<s.length();i++)
			{
				if(h1.get(s.charAt(i))!=null && h2.get(s.charAt(i))!=null)
				{
					temp=(h1.get(s.charAt(i))).compareTo(h2.get(s.charAt(i)));
					
					if(temp!=0)
						return false;
				}
				
				else
					return false;
			}
			
			return true;
		}
		
		return false;
	}

}

import java.util.Scanner;

// 28. Find the Index of the First Occurrence in a String

public class Leetcode_28_Find_index_Occurrence 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		String haystack = sc.next();
		
		String needle = sc.next();
		
		int res = strStr(haystack,needle);
		
		System.out.println(res);
	}
	
	public static int strStr(String haystack, String needle)
	{
//		if(haystack.contains(needle))
//			return haystack.indexOf(needle);
//		
//		else
//			return -1;
		
		
		
		int j=0;
		
		if(haystack.length()<needle.length())
            return -1;
		
		for(int i=0;i<=haystack.length()-needle.length();i++)
		{
			j=0;
			
			while(j<needle.length() && needle.charAt(j)==haystack.charAt(i+j))
				j++;			
		
			if(j==needle.length())
				return i;		
		}		
		
		return -1;		
	}
}

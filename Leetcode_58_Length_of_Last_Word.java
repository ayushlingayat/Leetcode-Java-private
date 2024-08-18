import java.util.Scanner;

public class Leetcode_58_Length_of_Last_Word 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		String s=sc.nextLine();
		
		int res= lengthOfLastWord(s);
		
		System.out.println(res);		
	}
	
	public static int lengthOfLastWord(String s)
	{
		s=s.stripTrailing();
		
		int count=0;
		
		for(int i=s.length()-1;i>=0;i--)
		{
			if(s.charAt(i)!=' ')
			{
				count++;				
			}	
			
			else
				break;
		}
		
		return count;
	}
}

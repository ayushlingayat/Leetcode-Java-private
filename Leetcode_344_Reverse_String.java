
public class Leetcode_344_Reverse_String 
{
	public static void main(String[] args) 
	{
		char s[]= {'h','e','l','l','o','m'};
		
		char t[] = reverseString(s);
		
		for(char i:t)
			System.out.print(i+" ");
	}
	
	public static char[] reverseString(char s[])
	{
		int l=0,h=s.length-1;
		
		while(l<=h)
		{
			char t=s[l];
			s[l]=s[h];
			s[h]=t;
			
			l++;
			h--;
		}        
		
		return s;
	}

}

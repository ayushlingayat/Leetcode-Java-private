
public class LEETCODE_125 
{
	public static void main(String[] args) 
	{
		String s = "0P";
				
		boolean res = isPalindrome(s);
		
		System.out.println(res);
	}
	
	public static String String_cleaning(String s)
	{
		s = s.replace(" ","");
		
//		System.out.println(s);
		
		StringBuilder s1 = new StringBuilder(s);
		
		for(int i=0;i<s1.length();i++)			
		{
			if(s1.charAt(i)>='A' && s1.charAt(i)<='Z')
			{
				s1.replace(i,i+1,Character.toString((char)(s1.charAt(i)+32)));
			}
			
			else if((s1.charAt(i)<'0' || s1.charAt(i)>'9') && (s1.charAt(i)<'a' || s1.charAt(i)>'z'))
			{
				s1.deleteCharAt(i);
				i=i-1;
			}
		}
		
		System.out.println(s1);
//		System.out.println("amanaplanacanalpanama".length());
		
		return s1.toString();
	}
	
	
	public static boolean isPalindrome(String s)
	{
		String ans = String_cleaning(s);
		
		int l=0,h=ans.length()-1;
		
		while(l<=h)
		{
			if(ans.charAt(l)!=ans.charAt(h))
			{
				return false;
			}
			
			l++;
			h--;
		}
		
		return true;
	}
}

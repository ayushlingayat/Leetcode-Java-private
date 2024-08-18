import java.util.HashMap;

public class LEETCODE_392 
{
	public static void main(String[] args) 
	{
		String s = "acb", t = "ahbgdc";
		
		boolean res = isSubsequence(s,t);
		
		System.out.println(res);
	}
	
	public static boolean isSubsequence(String a,String b)
	{
		if(a.length()==0 && b.length()==0) return true;

        else if(a.length()==0 && b.length()>0) return true;
		
        else if(a.length()>0 && b.length()==0) return false;
		
		int i=0,j=0,c=0;
		
		while(i<a.length() && j<b.length())
		{
			if(a.charAt(i)==b.charAt(j))
			{
				c++;
				i++;
			}

			j++;
		}
		
		return c==a.length();
	}

}

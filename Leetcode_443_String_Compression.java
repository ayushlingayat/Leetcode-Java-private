import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class Leetcode_443_String_Compression 
{
	public static void main(String[] args)
	{
		char chars[] = {'a','b','b','b','b','b','b','b','b','b','b','b','b'};
		
		int res = compress1(chars);
		
		System.out.println(res);
	}	
	
	public static int compress1(char chars[])
	{
		if(chars.length==1)
			return 1;
		
		else
		{
			int c1=0;
			
			String t="";
			
			for(int i=0;i<chars.length;i++)
			{
				c1=0;
				for(int j=i;j<chars.length;j++)
				{
					if(chars[i]==chars[j])
						c1++;
					
					else
						break;
				}
				
				if(i==0 )
				{
					t+=chars[i];
					
					if(c1!=1)
					{
						t+=c1;
					}
				}
				
				else
				{
					if(chars[i]!=chars[i-1])
					{
						t+=chars[i];
						
						if(c1!=1)
							t+=+c1;
					}
				}
			}
			
			System.out.println(t);
			
			int j=0;
			
			Arrays.fill(chars, '\0');
			
			for(int i=0;i<chars.length && j<t.length();i++,j++)
			{
				chars[i]=(t.charAt(j));
			}
			
			for(char i:chars)
				System.out.print(i);
			
			System.out.println();
			
			return t.length();		
		}
	}

}

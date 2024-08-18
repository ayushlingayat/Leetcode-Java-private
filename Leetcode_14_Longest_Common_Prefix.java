
public class Leetcode_14_Longest_Common_Prefix
{
	public static void main(String[] args) 
	{
		String strs[] = {"cir","car"};
		
		String res = LongestCommonPrefix(strs);		

		System.out.println(res);
	}
	
	public static String LongestCommonPrefix(String strs[])
	{
		String s= "";
		
		if(strs.length>0)	
		{
			int min= strs[0].length();
			
			for(int i=1;i<strs.length;i++)
			{
				if(min>strs[i].length())
				{
					min= strs[i].length();
				}
			}
						
			char temp[]= new char[strs[0].length()];
			
			temp= strs[0].toCharArray();
				
			boolean isSame = false;
			
			for(int i=0;i<min;i++)
			{
				for(int j=0;j<strs.length;j++)
				{
					if(temp[i]==strs[j].charAt(i))
					{
						isSame= true;
					}
					
					else
					{
						isSame =false;
						break;
					}
				}		
				
				if(isSame)
					s+=temp[i];
				
				else
					break;
			}
			
			return s;
		}
		
		else
			return "";	
	}
}

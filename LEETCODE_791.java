import java.util.HashSet;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class LEETCODE_791
{
	public static void main(String[] args) 
	{
		String order = "cba", s = "abcd";
		
//		System.out.println('k'-'a');
		
		String res = customSortString(order,s);
		
		System.out.println(res);
	}
	
	public static String customSortString(String order, String s)
	{   
		StringBuilder ans = new StringBuilder();
		
		int freq[]=new int[26];
		
		for(char i:s.toCharArray())
		{
			freq[i-'a']++;
		}
		
//		for(int i:freq)
//		{
//			System.out.println(i);
//		}
		
		for(int i=0;i<order.length();i++)
		{
			while(freq[order.charAt(i)-'a']>0)
			{
				ans.append(order.charAt(i));
				freq[order.charAt(i)-'a']--;
			}
		}
		
		for(int i=0;i<freq.length;i++)
		{
			while(freq[i]>0)
			{
				ans.append((char)(i+'a'));
				freq[i]--;
			}
		}
		
        return ans.toString();
    }
}
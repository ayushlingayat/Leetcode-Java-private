
public class LEETCODE_2309 {

	public static void main(String[] args)
	{
		String s="arRAzFif";
		
		String res = greatestLetter(s);
		
		System.out.println(res);

	}
	
	public static String greatestLetter(String s) 
    {
		int freq[] = new int[123];
		
		for(char c:s.toCharArray())
		{
			freq[c]++;
		}
		
		for(int i=122;i>=97;i--)
		{
			if(freq[i]!=0 && freq[i-32]!=0)
			{
				return ""+(char)(i-32);
			}			
		}
		
		return "";        
    }
}

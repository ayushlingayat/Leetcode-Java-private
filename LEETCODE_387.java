
public class LEETCODE_387 
{
	public static void main(String[] args) 
	{
		String s = "leetcode";
		
		int res = firstUniqChar(s);
		
		System.out.println(res);
	}
	
	public static int firstUniqChar(String s) 
	{
		if(s.length()==1) return 0;
		
        int freq[] = new int[26];
        
        for(char i:s.toCharArray())
        {
        	freq[i-'a']++;
        }
        
        for(char i:s.toCharArray())
        {
        	if(freq[i-'a']==1) return s.indexOf(i);
        }
        
        return -1;
    }

}

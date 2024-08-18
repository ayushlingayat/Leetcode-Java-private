import java.util.Arrays;

public class LEETCODE_2370 
{
	public static void main(String[] args) 
	{
		String s = "acfgbd";
		int k = 2;
		
		int res = longestIdealString(s,k);
		
		System.out.println(res);
	}

	public static int longestIdealString(String s, int k) 
    {
        int cache[] =new int[26];

        for(int i=0;i<s.length();++i)
        {
            int curr = s.charAt(i) -'a';
            int max = 0;

            for(int j=Math.max(0,curr-k);j<=Math.min(25,curr+k);j++)
            {
                max=Math.max(max,cache[j]);
            }

            cache[curr]= 1+max;
        }

        return Arrays.stream(cache).max().getAsInt();        
    }
}

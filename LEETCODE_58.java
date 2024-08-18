
public class LEETCODE_58 
{
	public static void main(String[] args) 
	{
		String s = "luffy is still joyboy";
		
		int res = lengthOfLastWord(s);
				System.out.println(res);
	}
	
	public static int lengthOfLastWord(String s) 
    {
        String t=s.trim();
        
        int c=0;

        for(int i=t.length()-1;i>=0;i--)
        {
            if(t.charAt(i)==' ') break;

            c++;
        }

        return c;
    }
}


public class LEETCODE_2864 
{
	public static void main(String[] args) 
	{
		String s = "010";
		
		String res = maximumOddBinaryNumber(s);
		
		System.out.println(res);
	}
	
	public static String maximumOddBinaryNumber(String s) 
	{
		if(s.length()==1) return s;
		
        StringBuilder ans = new StringBuilder();
        
        int c1=0, c0=0;        
        for(int i=0;i<s.length();i++)
        {
        	if(s.charAt(i)=='1') c1++;
        	else c0++;
        }
        
        for(int i=0;i<c1-1;i++)
        {
        	ans.append('1');
        }
        
        for(int i=0;i<c0;i++)
        {
        	ans.append('0');
        }
        
        ans.append('1');
        
        return ans.toString();
    }
}

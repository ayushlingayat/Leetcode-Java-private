
public class LEETCODE_1768 
{
	public static void main(String[] args) 
	{
		String word1 = "abc", word2 = "pqr";
		
		String res = mergeAlternately(word1,word2);
		
		System.out.println(res);
	}
	
	public static String mergeAlternately(String a, String b)
	{
        int i=0,j=0;
        
        StringBuilder s = new StringBuilder();
        
        while(i<a.length() && j<b.length())
        {
        	if(i==j)
        	{
        		s.append(a.charAt(i));
        		i++;
        	}
        	
        	else if(i>j)
        	{
        		s.append(b.charAt(j));
        		j++;
        	}
        }
        
        while(i<a.length())
        {
        	s.append(a.charAt(i));
    		i++;
        }
        
        while(j<b.length())
        {
        	s.append(b.charAt(j));
    		j++;
    	}
        
        return s.toString();
    }
}

import java.util.Arrays;

public class LEETCODE_1662
{
	public static void main(String[] args)
	{
		String word1[] = {"a", "cb"};
		String word2[] = {"ab", "c"};
		
		boolean res = arrayStringsAreEqual(word1,word2);
		
		System.out.println(res);
	}
	
	public static boolean arrayStringsAreEqual(String[] a, String[] b)
	{
        StringBuilder s = new StringBuilder();
        StringBuilder t = new StringBuilder();
        
        for(String i:a)
        {
        	s.append(i);
        }
        
        for(String i:b)
        {
        	t.append(i);
        }
        
//        return s.toString().equals(t.toString());
        
        return s.compareTo(t)==0;
    }
}

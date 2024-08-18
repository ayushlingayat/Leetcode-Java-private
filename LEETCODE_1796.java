import java.util.HashSet;
import java.util.TreeSet;

public class LEETCODE_1796 
{
	public static void main(String[] args) 
	{
		String s = "d4386fa84153221afd";
		
		// Method-1
		
//		TreeSet<Integer> h=new TreeSet<>();
//
//		for(int i =0;i<s.length();i++)
//		{
//			if(s.charAt(i)>=48 && s.charAt(i)<=57)
//			{
//				h.add(s.charAt(i)-48);
//			}
//		}
//		
//		int res=(int) h.toArray()[h.size()-2];
//		
//		System.out.println(res);
		
		// Method-2
		
		int k=2;
		
		for(char i='9';i>='0';i--)
		{
			if(s.indexOf(i) != -1) 
			{
				k--;
			}
			
			if(k==0)
			{
				System.out.println(i-'0');
				break;
			}
		}
			
		
	}
}

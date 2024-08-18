import java.util.HashMap;
import java.util.HashSet;

public class LEETCODE_290 
{
	public static void main(String[] args) 
	{
		String pattern = "abab", s = "dog cat cat dog";
		
		boolean res = wordPattern1(pattern,s);
		
		System.out.println(res);
	}
	
	public static boolean wordPattern1(String p, String s) 
	{
		String t[] = s.split(" ");
		
		if(p.length()!=t.length) return false;	
		
		HashSet<Character> m=new HashSet<>();
		HashSet<String> m1=new HashSet<>();
		
		for(int i=0;i<p.length();i++)
		{
			m.add(p.charAt(i));
			m1.add(t[i]);
		}
		
		if(m.size()!=m1.size()) return false;
		
		HashMap<Character,String> h = new HashMap<>();
		
		for(int i=0;i<p.length();i++)
		{
			char j = p.charAt(i);
			if(h.containsKey(j) && h.get(j).compareTo(t[i])!=0)
			{
				return false;
			}
			
			else
			{
				h.put(j,t[i]);
			}
		}
		
		return true;
	}
	
	public static boolean wordPattern(String p, String s) 
	{		
		String t[] = s.split(" ");
		
		if(p.length()!=t.length) return false;	
		
		HashSet<Character> m=new HashSet<>();
		HashSet<String> m1=new HashSet<>();
		
		for(int i=0;i<p.length();i++)
		{
			m.add(p.charAt(i));
			m1.add(t[i]);
		}
		
		if(m.size()!=m1.size()) return false;
		
		HashSet<Character> h1=new HashSet<>();		
//		HashMap<String,Character> h = new HashMap<>();
		
		HashMap<Character,String> h = new HashMap<>();
		
		for(int i=0;i<p.length();i++)
		{
			char j = p.charAt(i);
			if(h.containsKey(j) && h.get(j).toString()!=t[i])
			{
				System.out.println(i+" "+j+" "+h.get(j).length()+" "+t[i].length());
				return false;
			}
			
			else
			{
				h.put(j,t[i]);
				
				System.out.println(h);
			}
			h1.add(j);
		}
		
				
//		for(int i=0;i<p.length();i++)
//		{
//			if(h.containsKey(t[i]))
//			{
//				return false;
//			}
//			
//			else
//			{
//				h.put(t[i],p.charAt(i));
//			}
//			h1.add(p.charAt(i));
//		}
		
//		int n=h1.size();
//		
//		h1.clear();
//		
//		for(Entry<String, Character> q: h.entrySet())
//		{
//			h1.add(q.getValue());
//		}
		
		System.out.println(h1);
        
		System.out.println(h);
		
		return h.size()==h1.size();
    }

}

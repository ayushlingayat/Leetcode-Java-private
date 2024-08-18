import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Set;

public class LEETCODE_451 {
	public static void main(String[] args) {
		String s = "";
		s="tree";
//		s="Aabb";

		String res = frequencySort2(s);

		System.out.println(res);
		
	}
	
	public static String frequencySort2(String s) {
		
		int freq[] =new int[123];
		
		for(char c: s.toCharArray())
		{
			freq[c]++;
		}
		
//		for(int i=0;i<freq.length;i++) {
//			System.out.println("i = "+i+" freq = "+freq[i]);
//		}
		
		char ch[] = new char[s.length()];
		
		for(int i=0;i<ch.length;)
		{
			int max=0;
			int idx=0;
			
			for(int j=0;j<123;j++)
			{
				if(max<freq[j])
				{
					max=freq[j];
					idx=j;
				}
			}
			
			while(freq[idx]>0)
			{
				ch[i++]=(char)idx;
				freq[idx]--;
			}
		}
		
		return new String(ch);		
	}
	
	public static String frequencySort1(String s) {
		
		Map<Character,Integer> h=new HashMap<>();
		
		for(int i=0;i<s.length();i++)
		{
			h.put(s.charAt(i), h.getOrDefault(s.charAt(i), 0)+1);
		}
		
//		System.out.println(h);
		
		int a[]=new int[h.size()];
		int j=0;
		
		StringBuilder t = new StringBuilder();

		for(Entry<Character, Integer> i:h.entrySet())
		{
			a[j++]=i.getValue();
		}
		
		a = Arrays.stream(a)
		          .boxed()
		          .sorted(Comparator.reverseOrder())
		          .mapToInt(Integer::intValue)
		          .distinct()
		          .toArray();

		
		for(int i:a)
		{
			System.out.println(i);
		}
		
		for(int i:a)
		{
			for(Character c:getKeys(h, i))
			{
				System.out.println(c);
				for(int k=0;k<i;k++)
				{
					t.append(c);
				}
			}
			
			System.out.println();
		}
		
		return t.toString();
	}
	
	public static Set<Character> getKeys( Map<Character, Integer> map, Integer value) {

	      Set<Character> result = new HashSet<>();
	      if (map.containsValue(value)) {
	          for (Entry<Character, Integer> entry : map.entrySet()) {
	              if (Objects.equals(entry.getValue(), value)) {
	                  result.add(entry.getKey());
	              }
	              // we can't compare like this, null will throws exception
	              /*(if (entry.getValue().equals(value)) {
	                  result.add(entry.getKey());
	              }*/
	          }
	      }
	      return result;

	  }

}

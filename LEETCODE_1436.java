import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class LEETCODE_1436 
{
	public static void main(String[] args) 
	{
		List<List<String>> paths = new ArrayList<>();
		
		paths.add(new ArrayList<>(List.of("London", "New York")));
	    paths.add(new ArrayList<>(List.of("New York", "Lima")));
	    paths.add(new ArrayList<>(List.of("Lima", "Sao Paulo")));
				
	    String res = destCity(paths);
	    
	    System.out.println(res);
	}
	
	public static String destCity(List<List<String>> a) 
    {
//		HashSet<String> h=new HashSet<>();
		HashSet<String> h1=new HashSet<>();
		
		for(int i=0;i<a.size();i++)
		{
			h1.add(a.get(i).get(0));
		}
		
		for(int i=0;i<a.size();i++)
		{
			if(!h1.contains(a.get(i).get(1))) return a.get(i).get(1);
		}
		
//		for(String i:h)
//		{
//			if(!h1.contains(i)) return i;
//		}		
		
		return " ";
    }
}

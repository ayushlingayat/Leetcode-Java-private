import java.util.HashMap;

public class LEETCODE_525 
{
	public static void main(String[] args) 
	{
		int a[] = {0,1,0};
		
		int res = findMaxLength(a);
		
		System.out.println(res);
	}
	
	 public static int findMaxLength(int[] a) 
	 {
		 HashMap<Integer,Integer> h=new HashMap<>();
		 
		 int sum=0, len=0, start=0;
		 
		 h.put(sum,-1);
		 
		 for(int i=0;i<a.length;i++)
		 {
			 if(a[i]==0)
			 {
				 sum+=(-1);
			 }
			 
			 else
			 {
				 sum+=a[i];
			 }
			 
			 if(!h.containsKey(sum))
			 {
				 h.put(sum,i);
			 }
			 
			 else
			 {
				 start = h.get(sum);
				 
				 len=Math.max(len,i-start);
			 }
		 }
		 
		 return len;
	 }
}

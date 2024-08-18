import java.util.HashMap;
import java.util.PriorityQueue;

public class LEETCODE_1481 
{
	public static void main(String[] args) 
	{
		int arr[] = {4,3,1,1,3,3,2}, k = 3;
		
		int res = findLeastNumOfUniqueInts(arr,k);
		
		System.out.println(res);
	}
	
	public static int findLeastNumOfUniqueInts(int[] a, int k) 
	{		
		HashMap<Integer,Integer> h=new HashMap<>();
		
		for(int i=0;i<a.length;i++)
		{
			if(h.containsKey(a[i]))
			{
				h.put(a[i],h.getOrDefault(a[i],0)+1);
			}
			
			else
			{
				h.put(a[i],1);
			}
		}
		
		System.out.println(h);
		
		PriorityQueue<Integer> q=new PriorityQueue<>(h.values());
		
		System.out.println(q);
		
		while(!q.isEmpty() && k>0 && q.peek()<=k)
		{
			if(q.peek()<=k)
			{
				k-=q.peek();
				q.remove();				
			}			
		}
		
		return q.size();
	}
}

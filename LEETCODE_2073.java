import java.util.LinkedList;
import java.util.Queue;

public class LEETCODE_2073 
{
	public static void main(String[] args) 
	{
		int tickets[] = {5,1,1,1}, k = 0;
		
		int res = timeRequiredToBuy(tickets, k) ;
		
		System.out.println(res);
	}
	
	public static int timeRequiredToBuy(int[] tickets, int k) 
	{
		Queue<Integer> q=new LinkedList<>();
		
		int c=0;
		
		for(int i=0;i<tickets.length;i++)
		{
			q.add(i);
		}
		
		
		while(!q.isEmpty())
		{
			int t=q.poll();
			if(tickets[t]>0)
			{
				tickets[t]--;
				c++;
			}
			
			if(t==k && tickets[t]==0)
			{
				return c;
			}
			
			q.add(t);
		}
		
//		for(int i=0;i<tickets.length;i++)
//		{
//			if(tickets[i]>0)
//			{
//				q.add(i);
//				tickets[i]--;
//				c++;
//			}
//			
//			if(i==k && tickets[i]==0)
//			{
//				return c;
//			}
//		}
		
		return 0;
    }

}

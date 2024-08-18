import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class LEETCODE_950 
{
	public static void main(String[] args) 
	{
		int deck[] = {17,13,11,2,3,5,7};
		
		int res[] = deckRevealedIncreasing(deck) ;
		
		for(int i:res)
		{
			System.out.print(i+" ");
		}
	}
	
	public static int[] deckRevealedIncreasing(int[] deck) 
    {
		Arrays.sort(deck);
		
		int ans[] = new int[deck.length];
		
		Queue<Integer> q=new LinkedList<>();
		
		for(int i=0;i<deck.length;i++)
		{
			q.add(i);
		}
		
		for(int i=0;i<deck.length;i++)
		{
			ans[q.poll()]=deck[i];
			
			if(!q.isEmpty())
			{
				q.add(q.poll());
			}
		}
		
		return ans;
    }
}

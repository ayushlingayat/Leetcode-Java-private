import java.util.HashMap;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

class Task implements Comparable<Task>
{
	int frequency;
	int executionTime;
	
	Task(int f,int t)
	{
		frequency = f;
		executionTime = t;
	}
	
	public int compareTo(Task that)
	{
		return that.frequency-this.frequency;
	}
}

public class LEETCODE_621
{
	public static void main(String[] args)
	{
		char a[] = {'A','A','A','B','B','B'};
		
		int n=2;
		int res = leastInterval(a,n) ;
		
		System.out.println(res);
	}
	
	public static int leastInterval(char[] a, int n) 
    {
		//frequency
		HashMap<Character,Integer> freqMap=new HashMap<>();
		
		for(int i=0;i<a.length;i++)
		{
			freqMap.put(a[i], freqMap.getOrDefault(a[i], 0)+1);
		}
		
//		System.out.println(h);
		
		//insertion in max heap-Priority Queue
		PriorityQueue<Task> pq =new PriorityQueue<>();
		
		//insert tasks in pq
		for(Character ch: freqMap.keySet())
		{
			int freq = freqMap.get(ch);
			pq.offer(new Task(freq,0));
		}
		
		
		Queue<Task> queue = new LinkedList<>();
		
		int time=0;
		while(!queue.isEmpty() || !pq.isEmpty())
		{
			time++;
			//check if there is a task in pq & process it
			if(!pq.isEmpty())
			{
				Task task = pq.poll();
				task.frequency--;
				if(task.frequency>0)
				{
					//update the execution time
					task.executionTime = time+n;
					queue.offer(task);
				}
			}
			
			//shift the active process to the pq
			if(!queue.isEmpty() && queue.peek().executionTime== time)
			{
				pq.offer(queue.poll());
			}
		}
		
		return time;
    }
}

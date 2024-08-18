import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class LEETCODE_1700 
{
	public static void main(String[] args)
	{
//		int students[] = {1,1,1,0,0,1}, sandwiches[] = {1,0,0,0,1,1};
		
		int students[] = {1,1,0,0}, sandwiches[] = {0,1,0,1};
				
		int res = countStudents(students, sandwiches);
		
		System.out.println(res);		
	}
	
	public static int countStudents(int[] students, int[] sandwiches)
	{
		Stack<Integer> s=new Stack<>();
		
		Queue<Integer> q= new LinkedList<>();
		
		for(int i=0;i<students.length;i++)
		{
			q.add(students[i]);
		}
				
		for(int i=sandwiches.length-1;i>=0;i--)
		{
			s.add(sandwiches[i]);
		}	
		
		while(!q.isEmpty() && !s.isEmpty())
		{
			if(!q.contains(s.peek()))
			{
				break;
			}
			
			if(q.element()==s.peek())
			{
				q.poll();
				s.pop();
			}
			
			else
			{
				int t=q.poll();
				q.add(t);
			}
		}
		
		return q.size();
    }
}

class Node
{
	int val;
	Node link;
}

public class q206_Reverse_linked_list 
{
	static Node start=null;
	
	public static void main(String[] args) 
	{
		Node a=new Node();
		a.val=1;
		Node b=new Node();
		b.val=2;
		Node c=new Node();
		c.val=3;
		Node d=new Node();
		d.val=4;
		Node e=new Node();
		e.val=5;

		start=a;
		a.link=b;
		b.link=c;
		c.link=d;
		d.link=e;
		e.link=null;
		
		display();
		
		System.out.println();
		
		reverse(start);
		display();
	}
	
	public static void display()
	{
		Node t=start;
		
		while(t!=null)
		{
			System.out.print(t.val+" ");
			t=t.link;
		}
	}
	
	public static Node reverse(Node start)
	{
		if(start == null)
		{
			System.out.println("List is empty");
			return null;
		}
		
		else if( start.link==null)
		{
			System.out.println("List contains only one element");
			return start;
		}
		
		else
		{
			Node t= start;
			Node prev= null;
			Node next =null;
			
			while(t!= null)
			{
			    next = t.link;
				t.link=prev;
				prev=t;
				t=next;
			}
			
			start= prev;
			return start;
		}
	}

}

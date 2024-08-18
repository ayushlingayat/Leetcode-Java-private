
class n
{
	int val;
	n next;
	
	n(int val) { this.val = val; }
	
	n(int val,n next) { this.val = val; this.next = next; }
}

public class LEETCODE_143 
{
	public static void main(String[] args) 
	{
		n e = new n(5,null);
		n d = new n(4,e);
		n c = new n(3,d);
		n b = new n(2,c);
		n a = new n(1,b);
		
		reorderList(a);
		
//		int cnt=0;
//		
////		Stack<n> s=new Stack<>();
//		Stack<n> s1=new Stack<>();
//		
////		Queue<n> q = new ArrayDeque<n>();
//		
//		t=t.next;
//		while(t!=null)
//		{
////			System.out.print(t.val +" -> ");
//			
//			s.add(t);
//			s1.add(t);
//			cnt++;
//			
//			t=t.next;
//		}
//		
//		System.out.println(s);
//		System.out.println(s1);
//		
////		
//		
//		int c1=1,p=0;
//		n t1= a;
//		n t2=a;
//		
//		t1=t1.next;
//		n prev=a;
//		
//		while(t1!=null)
//		{
//			if(c1%2==0)
//			{
//				System.out.println(c1);
////				System.out.println(q.val);
//				prev.next = s1.remove(p);
//				
////				System.out.println();
//				p++;
//			}
//			
//			else if(c1%2!=0)
//			{
//				System.out.println(c1);
////				System.out.println(s.val);
//				prev.next = s.pop();
//			}
//			
//			c1++;
//			
//			prev=t1;
//			
//			t1=t1.next;
//		}
//		
//		prev.next=null;
//				
//		while(t2!=null)
//		{
//			System.out.print(t2.val+" -> ");
//			
//			t2=t2.next;
//		}		
	}
	
	public static void reorderList(n head)
	{
		n mid = getMiddle(head);		
		n head2 = reverseList(mid.next);		
		mid.next = null;
		head = reorder(head,head2);
		
		while(head!=null)
		{
			System.out.print(head.val+" -> ");
			
			head=head.next;
		}
	}
	
	public static n getMiddle(n head)
	{
		n slow=head;
		n fast = head;
		
		while(fast.next!=null && fast.next.next!=null)
		{
			slow=slow.next;
			fast=fast.next.next;
		}
		
		return slow;
	}
	
	public static n reverseList(n head)
	{
		n prev=null;
		n next = null;
		n curr=head;
		
		while(curr!=null)
		{
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;			
		}
		
		head = prev;
		
		return head;
	}
	
	public static n reorder(n head, n head2)
	{
		n p = head;
		
		while(p!=null && head2!=null)
		{
			n t = p.next;
			n t2 = head2.next;
			p.next = head2;
			head2.next = t;
			
			p= t;
			head2 = t2;
		}
		
		return head;
	}
}
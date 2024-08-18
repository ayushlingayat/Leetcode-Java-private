class ListNode 
{
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class Leetcode_2_Add_Two_Numbers 
{
	public static void main(String[] args)
	{
		
	}
	
	 public ListNode addTwoNumbers(ListNode l1, ListNode l2) 
	 {
	        ListNode newNode=new ListNode(0);
	        ListNode t= newNode, p=l1, q=l2;

	        int carry =0, sum =0;

	        while(p != null || q != null)
	        {
	            int x = p != null ? p.val : 0;
	            int y = q != null ? q.val : 0;

	            sum += x + y + carry;
	            carry = sum / 10;

	            t.next = new ListNode(sum%10);
	            t = t.next;

	            if(p != null)
	                p = p.next;
	            
	            if(q != null)
	                q = q.next;          

	            sum = 0;      
	        }

	        if(carry > 0)
	            t.next = new ListNode(carry);

	        return newNode.next;
	    }
}

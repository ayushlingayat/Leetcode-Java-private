import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

//import java.util.ArrayList;


class ListNode
{
	int val;
	ListNode next;
	
	ListNode()
	{
		
	}
	
	ListNode(int val)
	{
		this.val=val;
	}
	
	ListNode(int val, ListNode next) 
	{
		this.val = val; 
		this.next = next; 
	}
}


public class LEETCODE_1171 
{
	public ListNode removeZeroSumSublists(ListNode head) 
    {
        HashMap<Integer,ListNode> h=new HashMap<>();

        int pSum=0;
        ListNode dummy = new ListNode(0,head);

        ListNode temp=dummy;

        while(temp!=null)
        {
            pSum+=temp.val;
            h.put(pSum,temp);

            temp=temp.next;
        }

        pSum=0;
        temp = dummy;

        while(temp!=null)
        {
            pSum+=temp.val;
            temp.next = h.get(pSum).next;

            temp=temp.next;
        }

        return dummy.next;
    }
	
	public ListNode removeZeroSumSublists1(ListNode head) 
    {
		ListNode dummy = new ListNode(0);

        dummy.next=head;

        Map<Integer,ListNode> h=new HashMap<>();
        int sum=0;

        h.put(sum,dummy);

        while(head!=null)
        {
            sum += head.val;

            if(h.containsKey(sum))
            {
                ListNode start=h.get(sum);
                ListNode temp=start;

                int psum=sum;

                while(temp!=head)
                {
                    temp=temp.next;
                    psum+=temp.val;

                    if(temp!=head)
				    {
					    h.remove(psum);
                    }

                    start.next = temp.next;
                }
            }

            else
            {
                h.put(sum,head);
            }

            head=head.next;
        }
           
        return dummy.next;
    }
	
	public static void main(String[] args) 
	{
			
	}

}

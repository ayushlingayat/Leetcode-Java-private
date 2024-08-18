
public class LEETCODE_234 {

}

class ListNode2 {
	      int val;
	      ListNode2 next;
	      ListNode2() {}
	      ListNode2(int val) { this.val = val; }
	      ListNode2(int val, ListNode2 next) { this.val = val; this.next = next; }
	 }
	 
	class Solution1 {
	    public boolean isPalindrome(ListNode2 head) 
	    {
	        if(head==null || head.next==null) return true;
	        
	        StringBuilder s = new StringBuilder();

	        ListNode2 t=head;

	        while(t!=null)
	        {
	            s.append(t.val);
	            t=t.next;
	        }

	        int l=0,h=s.length()-1;

	        while(l<=h)
	        {
	            if(s.charAt(l)!=s.charAt(h)) return false;

	            l++;
	            h--;
	        }

	        return true;  
	    }
	}
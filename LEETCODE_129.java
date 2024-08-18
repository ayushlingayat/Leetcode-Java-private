
public class LEETCODE_129 
{
}

class TreeNode1 {
	     int val;
	     TreeNode1 left;
	     TreeNode1 right;
	     TreeNode1() {}
	     TreeNode1(int val) { this.val = val; }
	     TreeNode1(int val, TreeNode1 left, TreeNode1 right) {
	         this.val = val;
	         this.left = left;
	         this.right = right;
	     }
	 }
	 
	class Solution2 {
	    int sum=0;

	    public int sumNumbers(TreeNode1 root)
	    {
	        getLeafSum(root,0);

	        return sum;
	    }

	    public void getLeafSum(TreeNode1 root, int curNum)
	    {
	        if(root==null)
	        {
	            return;
	        }

	        //current node
	        // from the num
	        curNum = curNum*10 + root.val;

	        if(root.left==null && root.right==null)
	        {
	            sum+=curNum;
	            return;
	        }

	        //left call
	        getLeafSum(root.left,curNum);

	        //right call
	        getLeafSum(root.right,curNum);
	    }
	}
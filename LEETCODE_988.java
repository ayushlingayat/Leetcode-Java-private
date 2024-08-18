
public class LEETCODE_988 {
}

class TreeNode2 {
    int val;
    TreeNode2 left;
    TreeNode2 right;
    TreeNode2() {}
    TreeNode2(int val) { this.val = val; }
    TreeNode2(int val, TreeNode2 left, TreeNode2 right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

class Solution4 {

   String ans = "";

   public String smallestFromLeaf(TreeNode root) 
   {
       dfs(root, new StringBuilder());

       return ans;
   }

   public void dfs(TreeNode root, StringBuilder curString)
   {
       if(root==null)
       {
           return;
       }

       curString.insert(0,(char)(root.val + 'a'));

       if(root.left == null && root.right==null)
       {
           if(ans=="" || ans.compareTo(curString.toString())>0)
           {
               ans = curString.toString();
           }

           return;
       }

       if(root.left!=null)
       {
           dfs(root.left, curString);
           curString.deleteCharAt(0);
       }
       
       if(root.right!=null)
       {
           dfs(root.right, curString);
           curString.deleteCharAt(0);
       }        
   }
}
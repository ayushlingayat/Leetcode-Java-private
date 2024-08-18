
public class LEETCODE_2149 
{
	public static void main(String[] args) 
	{
		int n[] = {-1,1}; //3,1,-2,-5,2,-4
		
		int res[] = rearrangeArray(n);
		
		for(int i:res)
		{
			System.out.print(i+" ");
		}
	}
	
	public static int[] rearrangeArray(int[] n)
    {
        int ans[] = new int[n.length];
        int p=0,q=1;
        
        for(int i=0;i<n.length;i++)
        {
        	if(n[i]>0)
        	{
        		ans[p]=n[i];
        		p+=2;
        	}
        	
        	else if(n[i]<0)
        	{
        		ans[q]=n[i];
        		q+=2;
        	}
        }
        
        return ans;
    }

}

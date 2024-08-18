
public class LEETCODE_42 
{
	public static void main(String[] args) 
	{
		int height[] = {4,2,0,3,2,5};
		
		int res = trap(height);
		
		System.out.println(res);
	}
	
	public static int trap(int[] height) 
    {
        int water = 0;
        int leftMax = 0, rightMax = 0;
        int left = 0;
        int right = height.length - 1;
 
        while (left <= right) 
        {
            if (height[left] < height[right]) 
            {
            	if (height[left] > leftMax)
                {
            		leftMax = height[left];
                }
                  
                else
                {
                	water += leftMax - height[left];
                }
                  
                left += 1;
            } 
            
            else
            {
            	if (height[right] > rightMax)
            	{
            		rightMax = height[right];
            	}
            	
                else
                {
                	water += rightMax - height[right];
                }                       
                  
                right -= 1;
            }
      }
        
      return water;        
    }
}

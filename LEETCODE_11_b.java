
public class Q11_Conatiner_With_Most_Water_b 
{
	public static void main(String[] args) 
	{
		int a[]= {1,8,6,2,5,4,8,3,7};
		
		System.out.println("Water= "+rain(a));

	}
	
	public static int rain(int height[])
	{
		int maxarea = 0;
        int left = 0; 
        int right = height.length - 1;
        
        while (left < right) 
        {
            int width = right - left;
            
            maxarea = Math.max(maxarea, Math.min(height[left], height[right]) * width);
            
            if (height[left] <= height[right]) 
            {
                left++;
            } 
            
            else 
            {
                right--;
                
            }
        }
        
        return maxarea;
	}

}


public class LEETCODE_1752 
{
	public static void main(String[] args) 
	{
		int nums[]= {3,4,5,1,2};
		
		boolean res = check(nums);
		
		System.out.println(res);
	}
	
	public static boolean check(int[] nums)
    {
        int count=0;
        int n = nums.length;

        for(int i=0;i<n-1;i++)
        {
            if(nums[i]>nums[i+1]) count++;
        }

        if(count>1) return false;

        else if(count==0) return true;

        else if(count==1)
        {
            if(nums[0]>=nums[n-1]) return true;
        }

        return false;
    }
}

import java.util.HashMap;

public class Leetcode_219_Contains_Duplicate_II 
{
	public static void main(String[] args) 
	{
		int nums[]={1,2,3,1,2,3};
		
		int k=2;
		
		boolean res= containsNearbyDuplicate(nums,k);
		
		System.out.println(res);
	}
	
	public static boolean containsNearbyDuplicate(int nums[],int k)
	{
		HashMap<Integer,Integer> h=new HashMap<Integer,Integer>();
		
		for(int i=0;i<nums.length;i++)
		{
			if(k==0)
				return true;
			
			else if(h.containsKey(nums[i]) && i-h.get(nums[i])<=k)
				return true;
			
			else
				h.put(nums[i],i);
		}
		
		return false;
	}

}

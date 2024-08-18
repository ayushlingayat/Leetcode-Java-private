import java.util.Arrays;
import java.util.TreeSet;

public class Leetcode_26_Remove_Duplicates_from_Sorted_Array
{
	public static void main(String[] args) 
	{
		int nums[] = {-3,-1,0,0,0,3,3};
		
		int res = removeDuplicates(nums);
		
		System.out.println(res);
	}
	
	public static int removeDuplicates(int nums[])
	{
		TreeSet<Integer> h = new TreeSet<Integer>();		
		
		int j=0;
		
		for(int i:nums)
			h.add(i);
		
		Arrays.fill(nums,0);
				
		for(int i:h)	
		{
			nums[j++]=i;
		}
		
		return h.size();
	}

}

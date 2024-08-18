import java.util.HashMap;

public class Leetcode_169_Majority_Element 
{
	public static void main(String[] args) 
	{
		int nums[]= {2,2,1,1,1,2,2};
		
		int res= majorityElement(nums);
		
		System.out.println(res);
	}
	
	public static int majorityElement(int nums[])
	{
		HashMap<Integer,Integer> h= new HashMap<Integer,Integer>();
		
		int n= nums.length/2;
		
		for(int i:nums)
		{
			if(!h.containsKey(i))
				h.put(i,1);
			
			else
				h.put(i,h.get(i)+1);
		}
		
		System.out.println(h);
		
		for(int i:nums)
		{
			if(h.get(i)>n)
				return i;
		}
				
		return -1;
	}

}

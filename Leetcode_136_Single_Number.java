import java.util.HashMap;

public class Leetcode_136_Single_Number 
{
	public static void main(String[] args)
	{
		int nums[]= {1,1,2,2};
		
		int res= singleNumber(nums);
		
		System.out.println(res);
	}
	
	public static int singleNumber(int nums[])
	{
		HashMap<Integer,Integer> h= new HashMap<Integer,Integer>();
		
		for(int i : nums)
		{
			if(!h.containsKey(i))
				h.put(i,1);
				
			else
				h.put(i,h.get(i)+1);
		}

		for(int i:nums)
		{
			if(h.get(i)==1)
				return i;
		}
		
		return -1;
	}
}

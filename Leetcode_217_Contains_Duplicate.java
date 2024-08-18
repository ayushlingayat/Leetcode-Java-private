import java.util.Arrays;
import java.util.Hashtable;

public class Leetcode_217_Contains_Duplicate 
{
	public static void main(String[] args)
	{
		int nums[]= {1,2,3,1};
		
		
		boolean res= containsDuplicate(nums,3);
		
		System.out.println(res);		
	}
	
	public static boolean containsDuplicate(int nums[],int k)
	{
//		Hashtable<Integer,Integer> h=new Hashtable<Integer,Integer>();
//		
//		for(int i=0;i<nums.length;i++)
//		{
//			if(!h.contains(nums[i]))
//				h.put(nums[i],1);
//			
//			else
//			{
//				h.put(nums[i],h.get(nums[i])+1);
//				return true;
//			}
//		}
//		
//		return false;
		
		
//		Arrays.sort(nums);		
		
//		for(int i=0;i<nums.length;i++)
//		{
//			if(nums[i]==nums[i+1])
//				return true;
//		}
//		
//		return false;
		
		boolean isc=false;
		
		for(int i=0;i<nums.length-1;i++)
		{
			for(int j=0;j<nums.length;j++)
			{
				if(i!=j)
				{
					if(nums[i]==nums[j] && Math.abs(i-j)<=k)
					{
						isc=true;
						break;
					}					
				}					
			}
			
			if(isc)
				return true;
		}
		
		return false;
	
	}
}

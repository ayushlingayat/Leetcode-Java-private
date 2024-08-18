import java.util.Scanner;

public class Leetcode_35_Search_Insert_Position 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		
		int nums[] = {1,3};
		
		int target = sc.nextInt(); 
		
		int res = searchInsert(nums,target);
		
		System.out.println(res);
	}
	
	public static int searchInsert(int nums[], int target)
	{
		int l = 0, h = nums.length-1;
		
		int mid = 0;
		
		if(target>nums[nums.length-1])
			return nums.length;
		
		else if(target<nums[0])
			return 0;
		

		while(l<=h)
		{
			mid = l + (h-l)/2;			
			
			if(nums[mid]==target)
			{
				return mid;
			}
			
			else if(target<nums[mid])
			{
				h = mid-1;
			}
			
			else 
			{
				l = mid+1;
			}
		}
		
		System.out.println("mid = "+mid);
		
		if(nums[mid]>target)
		{
			if(nums[mid-1]<target)
				return mid;
			
			else
				return mid-1;
		}
		
		else
			return mid+1;
	}

}

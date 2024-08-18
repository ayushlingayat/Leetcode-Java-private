import java.util.Scanner;

public class Leetcode_27_Remove_Element 
{
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		
		int nums[] = {3,2,2,3};
		
		int val = sc.nextInt();
		
		int res= removeElement(nums,val);
		
		System.out.println(res);
	}
	
	public static int removeElement(int nums[],int val)
	{
		int j=0;
		
		for(int i=0;i<nums.length;i++)
		{
			if(nums[i]!=val)
			{
				nums[j++] = nums[i];
			}
		}
		
		for(int i=j;i<nums.length;i++)
		{
			nums[i]=0;
		}
		
		return j;
	}
}

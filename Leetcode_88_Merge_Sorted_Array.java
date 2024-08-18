public class Leetcode_88_Merge_Sorted_Array 
{
	public static void main(String[] args) 
	{
		int nums1[] = {0} , m = 0, nums2[] = {1}, n = 1;
		
		merge(nums1,m,nums2,n);
	}
	
	public static void merge(int[] nums1, int m, int[] nums2, int n)
    {
        int nums[]=new int[m+n];

        int p=0,q=0,i=0;

        while(p<m && q<n)
        {
            if(nums1[p]<nums2[q])
            {
                nums[i++]=nums1[p++];
            }

            else
            {
                nums[i++]=nums2[q++];
            }
        }

        while(p<m)
        {
            nums[i++]=nums1[p++];
        }

        while(q<n)
        {
            nums[i++]=nums2[q++];
        }
        
        i=0;

        for(i=0;i<nums.length;i++)
        {
            nums1[i]=nums[i];
        }   
        
        for(int a:nums1)
        {
        	System.out.print(a+" ");
        }
    }
}

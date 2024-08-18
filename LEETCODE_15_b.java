import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class q15_3sum_b 
{
	public static void main(String[] args) 
	{
		int a[]= {-1,0,1,2,-1,-4};
		
		List<List<Integer>> a1=new ArrayList<List<Integer>>();
		
		a1=triplet(a);
		
		System.out.println(a1);
	}	
	
	public static List<List<Integer>> triplet(int[] nums) 
	{
        Set<List<Integer>> res  = new HashSet<List<Integer>>();
        
        Arrays.sort(nums);
        
        for(int i=0; i<nums.length-2;i++)
        {
            int j =i+1;
            int k = nums.length-1;
            
            while(j<k)
            {
                if((nums[i]+nums[j]+nums[k])==0)
                {
                	res.add(Arrays.asList(nums[i],nums[j++],nums[k--]));
                }
                
                else if ((nums[i]+nums[j]+nums[k])>0)
                {
                	 k--;
                }
                
                else if ((nums[i]+nums[j]+nums[k])<0) 
                {
                	j++;
                }
            }
        }
        
        return new ArrayList<List<Integer>>(res);        
	}
	
}

import java.util.ArrayList;
import java.util.List;

public class LEETCODE_442 {

	public static void main(String[] args) {
		int nums[] = {4,3,2,7,8,2,3,1};

		List<Integer> res = findDuplicates(nums);
		
		System.out.println(res);
	}
	
	public static List<Integer> findDuplicates(int[] nums) {

        List<Integer> ans = new ArrayList<>();

        if(nums.length==1) return ans;

        int freq[] = new int[nums.length+1];

        for(int i:nums)
        {
            freq[i]++;
        }

        for(int i=0;i<freq.length;i++)
        {
            if(freq[i]==2)
            {
                ans.add(i);
            }
        }

        return ans;
    }

}

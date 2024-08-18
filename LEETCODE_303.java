import java.util.HashMap;

public class LEETCODE_303 {
}

class NumArray {

    int p[];

    public NumArray(int[] nums) 
    {
        p=new int[nums.length];
        
        int sum=0;
        for(int i=0;i<nums.length;i++)
        {
            sum+=nums[i];
            p[i]=sum;
        }
    }
    
    public int sumRange(int left, int right)
    {
        if(left==0)
        {
            return p[right];
        }

        return p[right]-p[left-1];
    }
}



class NumArray1 {

    HashMap<Integer,Integer> h;

    public NumArray1(int[] nums) 
    {
        h=new HashMap<>();
        
        int sum=0;
        for(int i=0;i<nums.length;i++)
        {
            sum+=nums[i];
            h.put(i,sum);
        }
    }
    
    public int sumRange(int left, int right)
    {
        if(left==0)
        {
            return h.get(right);
        }

        return h.get(right)-h.get(left-1);
    }
}




class NumArray2 {

    int nums[];

    public NumArray2(int[] nums) {
        this.nums= nums;
    }
    
    public int sumRange(int left, int right) {
        int sum=0;

        HashMap<Integer,Integer> h=new HashMap<>();

        for(int i=0;i<nums.length;i++)
        {
            sum+=nums[i];
            h.put(i,sum);
        }

        if(left==0)
        {
            return h.get(right);
        }

        return h.get(right)-h.get(left-1);
    }
}
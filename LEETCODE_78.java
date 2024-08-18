package Recursion;

import java.util.ArrayList;
import java.util.List;

public class LEETCODE_78
{
    static List<List<Integer>> ans;

    public static void main(String[] args)
    {
        int nums[] = {1,2,3};

        List<List<Integer>> res = subsets(nums);

        System.out.println(res);
    }

    public static List<List<Integer>> subsets(int[] a)
    {
        ans = new ArrayList<>();

        ArrayList<Integer> temp = new ArrayList<>();

        helper(0,a,temp);

        return ans;
    }

    public static void helper(int i, int a[], List<Integer> temp)
    {
        if(i==a.length)
        {
            ArrayList<Integer> list = new ArrayList<>();
            for (int j = 0; j < temp.size(); j++)
            {
                list.add(temp.get(j));
            }
            ans.add(list);
            return;
        }

        helper(i+1,a,temp);
        temp.add(a[i]);
        helper(i+1,a,temp);
        temp.remove(temp.size()-1);
    }
}

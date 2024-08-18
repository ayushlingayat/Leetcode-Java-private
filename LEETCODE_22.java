package Recursion;

import java.util.ArrayList;
import java.util.List;

public class LEETCODE_22
{
    static List<String> arr;

    public static void print(int open, int close, int n, String ans)
    {
        if(ans.length()==2*n)
        {
            arr.add(ans);
            return;
        }

        if(open<n) print(open+1,close,n,ans+"(");
        if(close<open) print(open,close+1,n,ans+")");
    }

    public static List<String> generateParenthesis(int n)
    {
        arr = new ArrayList<>(); //re-initialize
        print(0,0,n,"");

        return arr;
    }

    public static void main(String[] args)
    {
        int n=3;

        List<String> res = generateParenthesis(n);

        System.out.println(res);
    }

}

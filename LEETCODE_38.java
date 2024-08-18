package Recursion;

public class LEETCODE_38
{
    public static void main(String[] args)
    {
        int n=4;

        String res = countAndSay(n);

        System.out.println(res);
    }

    public static String countAndSay(int n) {
        if(n==1) return "1";

        StringBuilder s = new StringBuilder(countAndSay(n-1));
        s.append("@");
        StringBuilder ans = new StringBuilder();
        int i=0,j=0;

        while(j<s.length())
        {
            if(s.charAt(i)==s.charAt(j)) j++;
            else {
                int len = j-i;
                ans.append(len);
                ans.append(s.charAt(i));
                i=j;
            }
        }

        return ans.toString();
    }

    public static String countAndSay1(int n)
    {
        if(n==1) return "1";

        String s = countAndSay1(n-1) + "@";
        //now we have to modify s
        String ans = "";
        int i=0,j=0;

        while(j<s.length())
        {
            if(s.charAt(i)==s.charAt(j)) j++;
            else {
                int len = j-i;
                ans +=len;
                ans+=s.charAt(i);
                i=j;
            }
        }

        return ans;
    }

    public static String countAndSay2(int n)
    {
        if(n==1) return "1";

        String s = countAndSay2(n-1) ;
        //now we have to modify s
        String ans = "";
        int i=0,j=0;

        while(j<s.length())
        {
            if(s.charAt(i)==s.charAt(j)) j++;
            else {
                int len = j-i;
                ans +=len;
                ans+=s.charAt(i);
                i=j;
            }
        }
        int len = j-i;
        ans +=len;
        ans+=s.charAt(i);

        return ans;
    }
}

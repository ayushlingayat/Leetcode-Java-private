package BinarySearch;

public class LEETCODE_69
{
    public static void main(String[] args)
    {
        int x = 14;
        int res = mySqrt(x);

        System.out.println(res);
    }

    public static int mySqrt(int x)
    {
        long l=0,h=(long)x;

        while(l<=h)
        {
            long mid= l+(h-l)/2;

            if(mid*mid == x)
            {
                return (int)mid;
            }

            else if(mid*mid < x)
            {
                l= mid+1;
            }

            else
            {
                h=mid-1;
            }
        }

        return (int)h;
    }

    public static int mySqrt1(int x)
    {
        long h=x,l=0;

        long mid=0,ans=0;

        while(l<=h)
        {
            mid= l+(h-l)/2;

            if(mid*mid == x)
            {
                return (int)mid;
            }

            else if(mid*mid < x)
            {
                l= mid+1;
                ans=mid;
            }

            else
            {
                h=mid-1;
            }
        }

        return (int)ans;
    }

    public static int mySqrt2(int x)
    {
        if(x<=1) return x;

        int h=x,l=0;

        int mid=0;

        while(l<=h)
        {
            mid= l+(h-l)/2;

            if(mid == x/mid)
            {
                return (int)mid;
            }

            else if(mid < x/mid)
            {
                l= mid+1;
            }

            else
            {
                h=mid-1;
            }
        }

        return h;
    }
}

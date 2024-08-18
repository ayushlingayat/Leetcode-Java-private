package BinarySearch;

public class LEETCODE_1283
{
    public static void main(String[] args)
    {
        int a[] = {21212,10101,12121};
        int threshold = 1000000;

        int res= smallestDivisor(a,threshold);

        System.out.println(res);
    }

    public static int smallestDivisor(int[] a, int threshold)
    {
        int max=Integer.MIN_VALUE;

        for(int i=0;i<a.length;i++)
        {
            max=Math.max(max,a[i]);
        }

        int l=1,h=max;

        while(l<=h)
        {
            int mid=l+(h-l)/2;

            int sum=0;
            for(int i=0;i<a.length;i++)
            {
                if(a[i]%mid==0) sum+=(a[i]/mid);
                else sum+=(a[i]/mid +1);
            }

            if(sum<=threshold)
            {
                h=mid-1;
            }

            else
            {
                l=mid+1;
            }
        }

        return l;
    }

    public static boolean isLess(int mid, int a[], int threshold)
    {
        int sum=0;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]%mid==0) sum+=(a[i]/mid);
            else sum+=(a[i]/mid +1);
        }

        if(sum<=threshold) return true;

        return false;
    }

    public static int smallestDivisor2(int[] a, int threshold)
    {
        int max=Integer.MIN_VALUE;

        for(int i=0;i<a.length;i++)
        {
            max=Math.max(max,a[i]);
        }

        int d=1;
        int l=1,h=max;

        while(l<=h)
        {
            int mid=l+(h-l)/2;

            if(isLess(mid,a,threshold))
            {
                d=mid;
                h=mid-1;
            }

            else
            {
                l=mid+1;
            }
        }

        return d;
    }

    public static int smallestDivisor3(int[] a, int threshold)
    {
        //time limit exceeded

        int max=Integer.MIN_VALUE;

        for(int i=0;i<a.length;i++)
        {
            max=Math.max(max,a[i]);
        }

        int d;
        for(d=1;d<=max;d++)
        {
            int sum=0;
            for(int i=0;i<a.length;i++)
            {
                if(a[i]%d==0) sum+=(a[i]/d);
                else sum+=(a[i]/d +1);
            }

            if(sum<=threshold) return d;
        }

        return d;
    }
}

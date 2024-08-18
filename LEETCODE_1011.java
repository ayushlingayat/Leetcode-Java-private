package BinarySearch;

public class LEETCODE_1011
{
    public static void main(String[] args)
    {
        int weights[] = {1,2,3,4,5,6,7,8,9,10};
        int days =5;

        int res = shipWithinDays(weights,days);

        System.out.println(res);
    }

    public static int shipWithinDays(int[] a, int d)
    {
        int n=a.length;
        int sum=0,mx=Integer.MIN_VALUE;

        for(int i=0;i<n;i++)
        {
            sum+=a[i];
            mx=Math.max(mx,a[i]);
        }

        int l=mx,h=sum,minC=0;

        while(l<=h) // TC = O(n*log(sum-mx))
        {
            int mid=l+(h-l)/2;

            if(isPossible(mid,a,d))
            {
                minC=mid;
                h= mid-1;
            }

            else l=mid+1;
        }

        return minC;
    }

    public static boolean isPossible(int mid, int a[], int d)
    {
        int D=1;
        int load=0;

        for(int i=0;i<a.length;i++)
        {
            if(load+a[i]<=mid)
            {
                load+=a[i];
            }

            else
            {
                load=a[i];
                D++;
            }
        }

        if(D>d) return false;

        return true;
    }
}

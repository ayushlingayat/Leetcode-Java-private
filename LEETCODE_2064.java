package BinarySearch;

public class LEETCODE_2064
{
    public static void main(String[] args) {
        int n=6;

        int quantities[] = {11,6};

        int res = minimizedMaximum(n,quantities);

        System.out.println(res);
    }

    public static int minimizedMaximum(int n, int[] a)
    {
        int m= a.length;
        int mx=a[0];

        for(int i=1;i<a.length;i++)
        {
            mx = Math.max(mx,a[i]);
        }

        int l=1,h=mx;

        int maxAns=0;

        while(l<=h)
        {
            int mid = l+(h-l)/2;

            if(isPossible(mid,n,a))
            {
                maxAns=mid;
                h=mid-1;
            }

            else l=mid+1;
        }

        return maxAns;
    }

    public static boolean isPossible(int maxQ, int n, int a[])
    {
        int stores = 0;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]%maxQ==0) stores+=a[i]/maxQ;
            else stores+=a[i]/maxQ+1;
        }

        if(stores>n) return false;

        return true;
    }
}

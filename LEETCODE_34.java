package BinarySearch;

public class LEETCODE_34
{
    public static void main(String[] args) {
        int a[] ={5,7,7,8,8,10};
        int x=8;

        int res[] = searchRange1(a,x);

        for(int i:res)
        {
            System.out.println(i);
        }
    }

    public static int[] searchRange1(int[] a, int x) {
        int ans[] = new int[2];
        int n=a.length;
        int l,h;

        //first position
        int fp=-1;
        l=0;h=n-1;

        while(l<=h)
        {
            int mid = l+(h-l)/2;

            if(a[mid]==x)
            {
                if(mid>0 && a[mid]==a[mid-1]) h=mid-1;
                else
                {
                    fp=mid;
                    break;
                }
            }

            else if(a[mid]>x) h=mid-1;
            else if(a[mid]<x) l=mid+1;
        }

        //last position
        int lp=-1;
        l=0;h=n-1;

        l=0;h=n-1;

        while(l<=h)
        {
            int mid = l+(h-l)/2;

            if(a[mid]==x)
            {
                if(mid+1<a.length && a[mid]==a[mid+1]) l=mid+1;
                else
                {
                    lp=mid;
                    break;
                }
            }

            else if(a[mid]>x) h=mid-1;
            else if(a[mid]<x) l=mid+1;
        }

        ans[0]=fp;
        ans[1]=lp;

        return ans;
    }

    public static int[] searchRange(int[] a, int x) {
        int ans[]={-1,-1};

        // first check element is present or not
        int l=0,h=a.length-1;
        boolean flag=false;

        while(l<=h)
        {
            int mid = l+(h-l)/2;

            if(a[mid]==x)
            {
                flag=true;
                break;
            }

            else if(a[mid]>x) h=mid-1;
            else l=mid+1;
        }

        if(flag==false) return ans;

        //lower bound
        int lb=a.length;
        l=0;h=a.length-1;

        while(l<=h)
        {
            int mid = l+(h-l)/2;

            if(a[mid]>=x)
            {
                lb = Math.min(lb,mid);
                h=mid-1;
            }

            else l=mid+1;
        }

        ans[0]=lb;

        //upper bound
        int ub=a.length;
        l=0;h=a.length-1;

        while(l<=h)
        {
            int mid = l+(h-l)/2;

            if(a[mid]>x)
            {
                lb = Math.min(ub,mid);
                h=mid-1;
            }

            else l=mid+1;
        }

        ans[1]=ub-1;

        return ans;
    }
}


package BinarySearch;

public class LEETCODE_33
{
    public static void main(String[] args)
    {
        int a[]={3,1};

        int x = 1;
        int res = search1(a,x);

        System.out.println(res);
    }

    public static int search(int a[],int x)
    {
        int n=a.length;

        if(n<=2)
        {
            for(int i=0;i<n;i++)
            {
                if(a[i]==x) return i;
            }

            return -1;
        }

         int l=1,h=n-2;
         int p=-1;

         while(l<=h)
         {
             int mid=l+(h-l)/2;

             if(a[mid]>a[mid-1] && a[mid]>a[mid+1])
             {
                 p=mid;
                 break;
             }

             else if(a[mid]<a[mid-1] && a[mid]<a[mid+1])
             {
                 p=mid-1;
                 break;
             }

             else if(a[mid]>a[mid-1] && a[mid]<a[mid+1])
             {
                 if(a[mid]>a[n-1]) l=mid+1;
                 else h=mid-1;
             }
         }

         if(p==-1) //Array was never rotated
         {
             return bs(a,0,n-1,x);
         }

         int left = bs(a,0,p,x);

         if(left!=-1)
         {
             return left;
         }

         int right = bs(a,p+1, n-1,x);

         return right;
    }

    public static int bs(int a[], int l, int h, int x)
    {
        while(l<=h)
        {
            int mid=l+(h-l)/2;

            if(a[mid]==x) return mid;

            else if(a[mid]>x) h=mid-1;

            else l=mid+1;
        }

        return -1;
    }

    public static int search1(int a[],int x)
    {
        int n=a.length;
        int l=0,h=n-1;

        while(l<=h)
        {
            int mid = l+(h-l)/2;
            if(a[mid]==x) return mid;

            else if(a[mid]<=a[h]) // I am in right sorted array (mid to high everything is sorted)
            {
                if(a[mid]<x && x<=a[h]) l=mid+1;
                else h=mid-1;
            }

            else // I am in left sorted array (low to mid evrything is sorted)
            {
                if(a[l]<=x && x<a[mid]) h=mid-1;
                else l=mid+1;
            }
        }

        return -1;
    }
}

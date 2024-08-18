package BinarySearch;

public class LEETCODE_852
{
    public static void main(String[] args) {
        int a[] = {24,69,100,99,79,78,67,36,26,19};

        int res = peakIndexInMountainArray(a);

        System.out.println(res);
    }

    public static int peakIndexInMountainArray(int[] a)
    {
        int n=a.length;
        int l=1,h=n-2;

        while(l<=h)
        {
            int mid=l+(h-l)/2;

            if(a[mid]<a[mid+1])
            {
                l=mid+1;
            }

            else
            {
                h=mid-1;
            }
        }

        return l;
    }

    public static int peakIndexInMountainArray1(int[] a)
    {
        int n=a.length;
        int l=1,h=n-2;

        while(l<=h)
        {
            int mid=l+(h-l)/2;

            if(a[mid]>a[mid-1] && a[mid]>a[mid+1]) return mid;

            else if(a[mid]>a[mid-1] &&  a[mid]<a[mid+1]) l=mid+1;

            else h=mid-1;
        }

        return l;
    }
}

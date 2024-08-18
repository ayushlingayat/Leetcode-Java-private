package BinarySearch;

import java.util.HashSet;

public class LEETCODE_1539
{
    public static void main(String[] args)
    {
        int a[] = {2,3,4,7,11};

        int k=5;

        int res = findKthPositive1(a,k);

        System.out.println(res);
    }

    public static int findKthPositive(int[] arr, int k)
    {
        int temp[] = new int[k];
        int j=0;

        HashSet<Integer> h=new HashSet<Integer>();

        for(int i:arr)
            h.add(i);

        int count = 0;

        for(int i=1;i<=(arr.length+k) && count<k;i++)
        {
            if(!h.contains(i))
            {
                temp[j++]=i;
                count++;
            }
        }

        return temp[count-1];
    }

    public static int findKthPositive1(int[] a, int k)
    {
        int l=0,h=a.length-1;

        while(l<=h)
        {
            int mid=l+(h-l)/2;
            int missed = a[mid]-(mid+1);

            if(missed<k) l=mid+1;
            else h=mid-1;
        }

        return k+l;
    }
}
